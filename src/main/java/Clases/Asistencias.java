
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
  
     public void AgregarAlumno() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
        String NumeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del alumno:");
        String CorreoInstitucional = JOptionPane.showInputDialog("Ingrese el correo institucional del alumno:");
        String Codigo = JOptionPane.showInputDialog("Ingrese el código del alumno:");

        Alumno NuevoAlumno = new Alumno(nombre, edad, NumeroTelefono, CorreoInstitucional);
        NuevoAlumno.setCodigo(Codigo);
        alumnos.add(NuevoAlumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado con éxito.");
    }

    public void EliminarAlumno() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del alumno a eliminar:");
        Alumno EliminarAlumno = null;

        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                EliminarAlumno = alumno;
                break;
            }
        }

        if (EliminarAlumno != null) {
            alumnos.remove(EliminarAlumno);
            JOptionPane.showMessageDialog(null, "Alumno eliminado con éxito.");
        } 
    }

    public void VerAlumnos() {
        StringBuilder ListaAlumnos = new StringBuilder("Lista de Alumnos:\n");
        for (Alumno alumno : alumnos) {
            ListaAlumnos.append(alumno.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaAlumnos.toString());
    }
}
