package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase Alumno representa a un estudiante y hereda de la clase Persona,
 * contiene un código único de alumno y una lista de calificaciones
 */

public class Alumno extends Persona {

    private String codigo; // Código único del alumno
    private ArrayList<Double> calificaciones = new ArrayList<>();
    // Lista de calificaciones 

    public Alumno(String nombre, int edad, String numeroTelefono, String correoInstitucional) {
        super(nombre, edad, numeroTelefono, correoInstitucional);
    } //Constructor de la clase

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", calificaciones=" + calificaciones + '}';
    } //toString

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    } //Getter y Setter

    public void AgregarNota() {
        /**
     * Solicita al usuario que ingrese una calificación y la agrega a la lista de calificaciones,
     * muestra un mensaje de éxito o de error en caso de que la entrada no sea un número 
     * con un formato de excepción
     */
        try {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una calificación:"));
            calificaciones.add(calificacion);
            JOptionPane.showMessageDialog(null, "Nota agregada con éxito.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.");
        }
    }

    public void CalcularPromedio() {
         /**
     * Calcula y muestra el promedio de las notas del alumno,
     * si no hay calificaciones entonces muestra un mensaje indicando 
     * que no se puede calcular el promedio, de lo contrario muestra el promedio
     */
        if (calificaciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay notas para calcular el promedio.");
            return;
        }

        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / calificaciones.size();
        JOptionPane.showMessageDialog(null, "El promedio de notas es: " + promedio);
    }
}

  