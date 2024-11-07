package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Materias {
    
    String Nombre;
    int Código;
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    ArrayList<Asistencias> asistencias = new ArrayList<Asistencias>();

    public Materias(String Nombre, int Código) {
        this.Nombre = Nombre;
        this.Código = Código;
    }

    Materias(String nombreMateria, String codigoMateria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Materias{" + "Nombre=" + Nombre + ", C\u00f3digo=" + Código + ", alumnos=" + alumnos + ", asistencias=" + asistencias + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCódigo() {
        return Código;
    }

    public void setCódigo(int Código) {
        this.Código = Código;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asistencias> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencias> asistencias) {
        this.asistencias = asistencias;
    }
    
    public void agregarAlumno() {
        String nombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
        String numeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del alumno:");
        String correoInstitucional = JOptionPane.showInputDialog("Ingrese el correo institucional del alumno:");
        String codigoAlumno = JOptionPane.showInputDialog("Ingrese el código del alumno:");

        Alumno nuevoAlumno = new Alumno(nombreAlumno, edad, numeroTelefono, correoInstitucional);
        nuevoAlumno.setCodigo(codigoAlumno);
        alumnos.add(nuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado a la materia con éxito.");
    }

    public void eliminarAlumno() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno que desea eliminar:");
        Alumno EliminarAlumno = null;

        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                EliminarAlumno = alumno;
                break;
            }
        }

        if (EliminarAlumno != null) {
            alumnos.remove(EliminarAlumno);
            JOptionPane.showMessageDialog(null, "Alumno eliminado de la materia con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
        }
    }

    public void agregarAsistencia() {
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la asistencia:");
        Asistencias nuevaAsistencia = new Asistencias(fecha);
        asistencias.add(nuevaAsistencia);
        JOptionPane.showMessageDialog(null, "Asistencia agregada con éxito.");
    }

    public void eliminarAsistencia() {
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la asistencia que desea eliminar:");
        Asistencias asistenciaEliminar = null;

        for (Asistencias asistencia : asistencias) {
            if (asistencia.getFecha().equals(fecha)) {
                asistenciaEliminar = asistencia;
                break;
            }
        }

        if (asistenciaEliminar != null) {
            asistencias.remove(asistenciaEliminar);
            JOptionPane.showMessageDialog(null, "Asistencia eliminada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Asistencia no encontrada.");
        }
    }

    public void calcularAsistencias() {
        JOptionPane.showMessageDialog(null, "Total de asistencias: " + asistencias.size());
    }
}
