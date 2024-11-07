
package Clases;

public class Profesor extends Persona{
    
        int Cedula; 
        Double Sueldo_Basico;
        int Antiguedad; 

    public Profesor(int Cedula, Double Sueldo_Basico, int Antiguedad, String Nombre, int Edad, String NumeroTelefono, String CorreoInstitucional) {
        super(Nombre, Edad, NumeroTelefono, CorreoInstitucional);
        this.Cedula = Cedula;
        this.Sueldo_Basico = Sueldo_Basico;
        this.Antiguedad = Antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Cedula=" + Cedula + ", Sueldo_Basico=" + Sueldo_Basico + ", Antiguedad=" + Antiguedad + '}';
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public Double getSueldo_Basico() {
        return Sueldo_Basico;
    }

    public void setSueldo_Basico(Double Sueldo_Basico) {
        this.Sueldo_Basico = Sueldo_Basico;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }
       
        
   public void CalcularSueldo() {
       
   }     
}
