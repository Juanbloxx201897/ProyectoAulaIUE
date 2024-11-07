
package Clases;

import java.util.ArrayList;


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
        
    }
    
    public void EliminarAlumno() {
        
    }
    
   public void VerAlumnos() {
       
   }
}
