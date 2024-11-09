package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * La clase Materias representa una materia en un sistema académico asociada a alumnos y asistencias
 * permite gestionar alumnos y asistencias dentro de la materia
 */
public class Materias {
    
    String NombreMat; // Nombre de la materia
    int Código; // Código de la materia
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>(); // Lista de alumnos inscritos en la materia
    ArrayList<Asistencias> asistencias = new ArrayList<Asistencias>(); // Lista de asistencias de la materia

    public Materias(String Nombre, int Código) {
        this.NombreMat = Nombre;
        this.Código = Código;
    } //Constructor 

    Materias(String nombreMateria, String codigoMateria) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }  // Constructor no implementado 

    @Override
    public String toString() {
        return "Materias{" + "Nombre=" + NombreMat + ", C\u00f3digo=" + Código + ", alumnos=" + alumnos + ", asistencias=" + asistencias + '}';
    } //toString

    public String getNombre() {
        return NombreMat;
    }

    public void setNombre(String Nombre) {
        this.NombreMat = Nombre;
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
    } //Getter y Setter
    
    public void AgregarAlumno() {
        /**
     * Solicita al usuario los datos de un nuevo alumno y lo agrega a la lista de alumnos de la materia,
     * pide al usuario ingresar el nombre, edad, número de teléfono, correo y código del alumno
     */
        String NombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
        String NumeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del alumno:");
        String CorreoInstitucional = JOptionPane.showInputDialog("Ingrese el correo institucional del alumno:");
        String CodigoAlumno = JOptionPane.showInputDialog("Ingrese el código del alumno:");

        Alumno nuevoAlumno = new Alumno(NombreAlumno, Edad, NumeroTelefono, CorreoInstitucional);
        nuevoAlumno.setCodigo(CodigoAlumno);
        alumnos.add(nuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado a la materia con éxito.");
    }

    public void EliminarAlumno() {
         /**
     * Elimina un alumno de la lista de alumnos de la materia por su código,
     * solicita al usuario el código del alumno que desea eliminar y lo elimina de la lista
     */
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno que desea eliminar:");
        Alumno EliminarAlumno = null;

        for (Alumno alumno : alumnos) {
             // Busca el alumno en la lista por el código
            if (alumno.getCodigo().equals(codigo)) {
                EliminarAlumno = alumno;
                break;
            }
        }

        if (EliminarAlumno != null) {
            // Si encuentra el alumno lo elimina de la lista
            alumnos.remove(EliminarAlumno);
            JOptionPane.showMessageDialog(null, "Alumno eliminado de la materia con éxito.");
        } 
    }

    public void AgregarAsistencia() {
         /**
     * Solicita al usuario la fecha de una nueva asistencia y la agrega a la lista de asistencias
     */
        String Fecha = JOptionPane.showInputDialog("Ingrese la fecha de la asistencia:");
        Asistencias NuevaAsistencia = new Asistencias(Fecha);
        asistencias.add(NuevaAsistencia);
        JOptionPane.showMessageDialog(null, "Asistencia agregada con éxito.");
    }

    public void EliminarAsistencia() {
          /**
     * Elimina una asistencia de la lista de asistencias de la materia por su fecha,
     * solicita al usuario la fecha de la asistencia que desea eliminar y la elimina de la lista.
     */
        String Fecha = JOptionPane.showInputDialog("Ingrese la fecha de la asistencia que desea eliminar:");
        Asistencias EliminarAsistencia = null;

        for (Asistencias asistencia : asistencias) {
            //Busca la asistencia en la lista
            if (asistencia.getFecha().equals(Fecha)) {
                EliminarAsistencia = asistencia;
                break;
            }
        }

        if (EliminarAsistencia  != null) {
            // Si encuentra la asistencia la elimina
            asistencias.remove(EliminarAsistencia );
            JOptionPane.showMessageDialog(null, "Asistencia eliminada con éxito.");
        } 
    }

    public void calcularAsistencias() {
        /**
     * Calcula y muestra el total de asistencias registradas
     */
        JOptionPane.showMessageDialog(null, "Total de asistencias: " + asistencias.size());
    }
}
