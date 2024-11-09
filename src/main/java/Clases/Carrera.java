package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase Carrera representa una carrera universitaria que pertenece a una facultad específica,
 * contiene listas de carreras y materias
 */
public class Carrera {
    
    String NombreCar; // Nombre de la carrera
    String Facultad; // Facultad a la que pertenece la carrera
    ArrayList<Carrera> carreras = new ArrayList<Carrera>(); // Lista de carreras
    ArrayList<Materias> materias = new ArrayList<Materias>(); // Lista de materias 
    
    public Carrera(String Nombre, String Facultad) {
        this.NombreCar = Nombre;
        this.Facultad = Facultad;
    } // Constructor

    @Override
    public String toString() {
        return "Carrera{" + "Nombre=" + NombreCar + ", Facultad=" + Facultad + ", carreras=" + carreras + ", materias=" + materias + '}';
    } //toString 

    public String getNombre() {
        return NombreCar;
    }

    public void setNombre(String Nombre) {
        this.NombreCar = Nombre;
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
    } //Getter y Setter
    
     public void AgregarCarrera() {
         /**
     * Solicita al usuario los datos de una nueva carrera y la agrega a la lista de carreras,
     * pide al usuario ingresar el nombre y la facultad de la nueva carrera
     */
        String NombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera:");
        String FacultadCarrera = JOptionPane.showInputDialog("Ingrese la facultad de la carrera:");

        // Crea un nuevo objeto Carrera con los datos ingresados
        Carrera NuevaCarrera = new Carrera(NombreCarrera, FacultadCarrera);
        carreras.add(NuevaCarrera);
        JOptionPane.showMessageDialog(null, "Carrera agregada con éxito.");
    }

    public void EliminarCarrera() {
        /**
     * Elimina una carrera de la lista buscando por el nombre,
     * Solicita al usuario el nombre de la carrera a eliminar y la elimina de la lista.
     */
        String NombreCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera a eliminar:");
        Carrera EliminarCarrera = null;

        for (Carrera carrera : carreras) {
            // Busca la carrera en la lista por el nombre
            if (carrera.getNombre().equals(NombreCarrera)) {
                EliminarCarrera = carrera;
                break;
            }
        }

        if (EliminarCarrera != null) {
            // Si encuentra la carrera entonces la elimina de la lista
            carreras.remove(EliminarCarrera);
            JOptionPane.showMessageDialog(null, "Carrera eliminada con éxito.");
        } 
    }

    public void VerCarreras() {
         /**
     * Muestra la lista de carreras en un cuadro de diálogo,
     * genera una lista en formato de texto con los datos de cada carrera
     */
        StringBuilder ListaCarreras = new StringBuilder("Lista de Carreras:\n");
        for (Carrera carrera : carreras) {
            ListaCarreras.append(carrera.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaCarreras.toString());
    }

    public void AgregarMateria() {
         /**
     * Solicita al usuario los datos de una nueva materia y la agrega a la lista de materias,
     * pide al usuario ingresar el nombre y el código de la nueva materia.
     */
        String NombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        int CodigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia:"));

         // Crea un nuevo objeto Materias con los datos ingresados
        Materias NuevaMateria = new Materias(NombreMateria, CodigoMateria);
        materias.add(NuevaMateria);
        JOptionPane.showMessageDialog(null, "Materia agregada con éxito.");
    }

    public void EliminarMateria() {
        /**
     * Elimina una materia de la lista de materias buscando por el código,
     * solicita al usuario el código de la materia a eliminar y la elimina de la lista.
     */
        int CodigoMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia a eliminar:"));
        Materias EliminarMateria = null;

        for (Materias materia : materias) {
             // Busca la materia en la lista por el código
            if (materia.getCódigo() == CodigoMateria) {
                EliminarMateria = materia;
                break;
            }
        }

        if (EliminarMateria != null) {
            // Si encuentra la materia entonces la elimina de la lista
            materias.remove(EliminarMateria);
            JOptionPane.showMessageDialog(null, "Materia eliminada con éxito.");
        } 
    }

    public void VerMaterias() {
         /**
     * Muestra la lista de materias en un cuadro de diálogo,
     * genera una lista en formato de texto con los datos de cada materia
     */
        StringBuilder ListaMaterias = new StringBuilder("Lista de Materias:\n");
        for (Materias materia : materias) {
            ListaMaterias.append(materia.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ListaMaterias.toString());
    }
}

