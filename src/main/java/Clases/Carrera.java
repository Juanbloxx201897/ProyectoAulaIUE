package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


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
    
     public void agregarCarrera() {
        String nombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera:");
        String facultadCarrera = JOptionPane.showInputDialog("Ingrese la facultad de la carrera:");

        Carrera nuevaCarrera = new Carrera(nombreCarrera, facultadCarrera);
        carreras.add(nuevaCarrera);
        JOptionPane.showMessageDialog(null, "Carrera agregada con éxito.");
    }

    public void eliminarCarrera() {
        String nombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera a eliminar:");
        Carrera carreraEliminar = null;

        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                carreraEliminar = carrera;
                break;
            }
        }

        if (carreraEliminar != null) {
            carreras.remove(carreraEliminar);
            JOptionPane.showMessageDialog(null, "Carrera eliminada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Carrera no encontrada.");
        }
    }

    public void verCarreras() {
        StringBuilder listaCarreras = new StringBuilder("Lista de Carreras:\n");
        for (Carrera carrera : carreras) {
            listaCarreras.append(carrera.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaCarreras.toString());
    }

    public void agregarMateria() {
        String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        int codigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia:"));

        Materias nuevaMateria = new Materias(nombreMateria, codigoMateria);
        materias.add(nuevaMateria);
        JOptionPane.showMessageDialog(null, "Materia agregada con éxito.");
    }

    public void eliminarMateria() {
        int codigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia a eliminar:"));
        Materias materiaEliminar = null;

        for (Materias materia : materias) {
            if (materia.getCódigo() == codigoMateria) {
                materiaEliminar = materia;
                break;
            }
        }

        if (materiaEliminar != null) {
            materias.remove(materiaEliminar);
            JOptionPane.showMessageDialog(null, "Materia eliminada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Materia no encontrada.");
        }
    }

    public void verMaterias() {
        StringBuilder listaMaterias = new StringBuilder("Lista de Materias:\n");
        for (Materias materia : materias) {
            listaMaterias.append(materia.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaMaterias.toString());
    }
}

