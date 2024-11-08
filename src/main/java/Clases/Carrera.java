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
    
     public void AgregarCarrera() {
        String NombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera:");
        String FacultadCarrera = JOptionPane.showInputDialog("Ingrese la facultad de la carrera:");

        Carrera NuevaCarrera = new Carrera(NombreCarrera, FacultadCarrera);
        carreras.add(NuevaCarrera);
        JOptionPane.showMessageDialog(null, "Carrera agregada con éxito.");
    }

    public void EliminarCarrera() {
        String NombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera a eliminar:");
        Carrera EliminarCarrera = null;

        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(NombreCarrera)) {
                EliminarCarrera = carrera;
                break;
            }
        }

        if (EliminarCarrera != null) {
            carreras.remove(EliminarCarrera);
            JOptionPane.showMessageDialog(null, "Carrera eliminada con éxito.");
        } 
    }

    public void VerCarreras() {
        StringBuilder ListaCarreras = new StringBuilder("Lista de Carreras:\n");
        for (Carrera carrera : carreras) {
            ListaCarreras.append(carrera.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaCarreras.toString());
    }

    public void AgregarMateria() {
        String NombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        int CodigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia:"));

        Materias NuevaMateria = new Materias(NombreMateria, CodigoMateria);
        materias.add(NuevaMateria);
        JOptionPane.showMessageDialog(null, "Materia agregada con éxito.");
    }

    public void EliminarMateria() {
        int CodigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia a eliminar:"));
        Materias EliminarMateria = null;

        for (Materias materia : materias) {
            if (materia.getCódigo() == CodigoMateria) {
                EliminarMateria = materia;
                break;
            }
        }

        if (EliminarMateria != null) {
            materias.remove(EliminarMateria);
            JOptionPane.showMessageDialog(null, "Materia eliminada con éxito.");
        } 
    }

    public void VerMaterias() {
        StringBuilder ListaMaterias = new StringBuilder("Lista de Materias:\n");
        for (Materias materia : materias) {
            ListaMaterias.append(materia.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaMaterias.toString());
    }
}

