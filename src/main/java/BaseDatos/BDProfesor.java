import Clases.Profesor;
import java.util.LinkedList;
import java.util.StringTokenizer;
import BaseDatos.ArchivoProfesores;

public class BDProfesor{

    public LinkedList<Profesor> obtener() {
        LinkedList<Profesor> profesores = null;
        ArchivoProfesores archivo = new ArchivoProfesores("profesores.txt"); //nombre del archivo plano
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            profesores = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String descripcion = tokens.nextToken();
                float precio = Float.parseFloat(tokens.nextToken());
                int existencias = Integer.parseInt(tokens.nextToken());
                profesores.add(new (codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 
            }
        }
        return profesores;

    }

    public boolean registrarProfesor(Profesor a) {
        ArchivoProfesores archivo = new ArchivoProfesores("profesores.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        ArchivoProfesores archivo = new ArchivoProfesores("profesores.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}