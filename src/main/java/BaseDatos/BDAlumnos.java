import Clases.Alumno;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDAlumnos {

    public LinkedList<Alumno> obtener() {
        LinkedList<Alumno> alumnos = null;
        Archivo archivo = new Archivo("productos.txt"); //nombre del archivo plano
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            productos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String descripcion = tokens.nextToken();
                float precio = Float.parseFloat(tokens.nextToken());
                int existencias = Integer.parseInt(tokens.nextToken());
                alumnos.add(new Alumno(codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 

            }

        }
        return alumnos;

    }

    public boolean registrarAlumno(Alumno a) {
        Archivo archivo = new Archivo("productos.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        Archivo archivo = new Archivo("productos.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}
