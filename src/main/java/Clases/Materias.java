package Clases;

import java.util.ArrayList;

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
    
    
    public void AgregarAlumno() {
        
    }
    
    public void EliminarAlumno() {
        
    }
    
    public void AgregarAsistencia() {
        
    }
    
    public void EliminarAsistencia() {
        
    }
    
    public void CalcularAsistencias(){
        
    }

}

