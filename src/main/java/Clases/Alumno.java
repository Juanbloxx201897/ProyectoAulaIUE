package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alumno extends Persona {

    private String codigo;
    private ArrayList<Double> calificaciones = new ArrayList<>();

    public Alumno(String nombre, int edad, String numeroTelefono, String correoInstitucional) {
        super(nombre, edad, numeroTelefono, correoInstitucional);
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", calificaciones=" + calificaciones + '}';
    }

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
    }

    public void AgregarNota() {
        try {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una calificación:"));
            calificaciones.add(calificacion);
            JOptionPane.showMessageDialog(null, "Nota agregada con éxito.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.");
        }
    }

    public void CalcularPromedio() {
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

  