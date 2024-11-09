
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase Asistencias representa una lista de asistencia para una fecha específica,
 * Contiene una lista de alumnos presentes en esa fecha
 */
public class Asistencias {
    
    String Fecha; // Fecha de asistencia
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>(); // Lista de los alumnos presentes

    public Asistencias(String Fecha) {
        this.Fecha = Fecha;
    } //Constructor

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    } //Getter y Setter

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
     @Override
    public String toString() {
        return "Asistencias{" + "Fecha=" + Fecha + ", alumnos=" + alumnos + '}';
    } //toString
  
     public void AgregarAlumno() {
          /**
     * Solicita al usuario los datos de un alumno y lo agrega a la lista de asistencia,
     * pide al usuario ingresar el nombre, edad, número de teléfono, correo institucional y código del alumno
     */
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
        String NumeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del alumno:");
        String CorreoInstitucional = JOptionPane.showInputDialog("Ingrese el correo institucional del alumno:");
        String Codigo = JOptionPane.showInputDialog("Ingrese el código del alumno:");

        // Crea un nuevo objeto Alumno con los datos ingresados
        Alumno NuevoAlumno = new Alumno(nombre, edad, NumeroTelefono, CorreoInstitucional);
        NuevoAlumno.setCodigo(Codigo);
        alumnos.add(NuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado con éxito.");
    }  

    public void EliminarAlumno() {
         /**
     * Elimina un alumno de la lista de asistencia buscando por su código,
     * pide al usuario el código del alumno y si existe en la lista entonces lo elimina
     */
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno a eliminar:");
        Alumno EliminarAlumno = null;

         // Busca el alumno en la lista por el código
         for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                EliminarAlumno = alumno;
                break;
            }
        }
         // Si encuentra el alumno, lo elimina de la lista
        if (EliminarAlumno != null) {
            alumnos.remove(EliminarAlumno);
            JOptionPane.showMessageDialog(null, "Alumno eliminado con éxito.");
        } 
    }

    public void VerAlumnos() {
         /**
     * Muestra la lista de alumnos presentes en la asistencia,
     * genera una lista en formato de texto con los datos de cada alumno y 
     * la muestra en un cuadro de diálogo
     */
        StringBuilder ListaAlumnos = new StringBuilder("Lista de Alumnos:\n");
        for (Alumno alumno : alumnos) {
            ListaAlumnos.append(alumno.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaAlumnos.toString());
    }
}
