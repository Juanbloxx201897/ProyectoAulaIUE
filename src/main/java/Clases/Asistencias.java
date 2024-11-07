
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Asistencias {
    
    String Fecha;
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public Asistencias(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return "Asistencias{" + "Fecha=" + Fecha + ", alumnos=" + alumnos + '}';
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
  
     public void agregarAlumno() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
        String numeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del alumno:");
        String correoInstitucional = JOptionPane.showInputDialog("Ingrese el correo institucional del alumno:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno:");

        Alumno nuevoAlumno = new Alumno(nombre, edad, numeroTelefono, correoInstitucional);
        nuevoAlumno.setCodigo(codigo);
        alumnos.add(nuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado con éxito.");
    }

    public void eliminarAlumno() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno a eliminar:");
        Alumno alumnoEliminar = null;

        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                alumnoEliminar = alumno;
                break;
            }
        }

        if (alumnoEliminar != null) {
            alumnos.remove(alumnoEliminar);
            JOptionPane.showMessageDialog(null, "Alumno eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
        }
    }

    public void verAlumnos() {
        StringBuilder listaAlumnos = new StringBuilder("Lista de Alumnos:\n");
        for (Alumno alumno : alumnos) {
            listaAlumnos.append(alumno.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaAlumnos.toString());
    }
}
