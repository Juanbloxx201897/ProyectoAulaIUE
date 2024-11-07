package Clases;

import java.util.ArrayList;


public class Carrera {
    
    String Nombre;
    String Facultad;
    ArrayList<Carrera> carreras = new ArrayList<Carrera>();
    ArrayList<Materias> materias = new ArrayList<Materias>();
    
    public Carrera(String Nombre, String Facultad) {
        this.Nombre = Nombre;
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return "Carrera{" + "Nombre=" + Nombre + ", Facultad=" + Facultad + ", carreras=" + carreras + ", materias=" + materias + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materias> materias) {
        this.materias = materias;
    }
    
     public void AgregarMateria() {
        
    }
    
    public void EliminarMateria() {
        
    }
    
    public void VerMaterias() {
        
    }
    
    public void AgregarCarrera() { 
        
    }
    
    public void EliminarCarrera() {
        
    }
}
