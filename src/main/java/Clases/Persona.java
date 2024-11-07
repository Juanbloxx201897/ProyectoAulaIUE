package Clases;

public class Persona {
    
    String Nombre;
    int Edad;
    String NumeroTelefono;
    String CorreoInstitucional;

    public Persona(String Nombre, int Edad, String NumeroTelefono, String CorreoInstitucional) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NumeroTelefono = NumeroTelefono;
        this.CorreoInstitucional = CorreoInstitucional;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", NumeroTelefono=" + NumeroTelefono + ", CorreoInstitucional=" + CorreoInstitucional + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getCorreoInstitucional() {
        return CorreoInstitucional;
    }

    public void setCorreoInstitucional(String CorreoInstitucional) {
        this.CorreoInstitucional = CorreoInstitucional;
    }
    
    
}