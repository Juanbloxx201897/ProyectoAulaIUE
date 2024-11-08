package Clases;
/**
 * La clase Persona representa una persona con atributos básicos como nombre, edad,
 * número de teléfono y correo institucional.
 */
public class Persona {
    
    String Nombre; // Nombre de la persona
    int Edad; // Edad de la persona
    String NumeroTelefono; // Número de télefono de la persona
    String CorreoInstitucional; // Correo Instituciional de la persona

    public Persona(String Nombre, int Edad, String NumeroTelefono, String CorreoInstitucional) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NumeroTelefono = NumeroTelefono;
        this.CorreoInstitucional = CorreoInstitucional;
    } // Constructor

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", NumeroTelefono=" + NumeroTelefono + ", CorreoInstitucional=" + CorreoInstitucional + '}';
    } //toString

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
    } //Getter y Setter
    
    
}