
package Clases;

import javax.swing.JOptionPane;
/**
 * La clase Profesor hereda de la clase Persona, 
 * además de los atributos de la persona incluye su cédula sueldo básico 
 * y antigüedad, tiene un método para calcular su sueldo total considerando la antigüedad
 */
public class Profesor extends Persona{
    
        int Cedula; // Cedula del profesor
        Double Sueldo_Basico; // Sueldo básico del profesor
        int Antiguedad;  // Años de antiguedad del profesor

    public Profesor(int Cedula, Double Sueldo_Basico, int Antiguedad, String Nombre, int Edad, String NumeroTelefono, String CorreoInstitucional) {
        super(Nombre, Edad, NumeroTelefono, CorreoInstitucional);
        this.Cedula = Cedula;
        this.Sueldo_Basico = Sueldo_Basico;
        this.Antiguedad = Antiguedad;
    } // Constructor

    @Override
    public String toString() {
        return "Profesor{" + "Cedula=" + Cedula + ", Sueldo_Basico=" + Sueldo_Basico + ", Antiguedad=" + Antiguedad + '}';
    } //toString

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
    } //Getter y Setter
       
     public void CalcularSueldo() {
                /**
     * Calcula el sueldo total del profesor considerando un aumento basado en su antigüedad
     * el aumento es un 5% adicional por cada año de antigüedad.
     */

            int Antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antigüedad:"));
            // Solicita la antigüedad al usuario a través de un cuadro de diálogo
        double IncrementoPorAntiguedad = 0.05 * Antiguedad; 
        // Calcula el aumento por antigüedad que es el 5% por año
            double sueldoBasico = 0;
        double sueldoTotal = sueldoBasico * (1 + IncrementoPorAntiguedad);
          // Calcula el sueldo total considerando el aumento
        JOptionPane.showMessageDialog(null, "El sueldo total del profesor es: $" + sueldoTotal);
        // Muestra el sueldo calculado
    }
}