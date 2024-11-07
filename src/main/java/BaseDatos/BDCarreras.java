import Clases.Carrera;
import java.util.LinkedList;
import java.util.StringTokenizer;
import BaseDatos.ArchivoCarreras;

public class BDCarreras{

    public LinkedList<Carrera> obtener() {
        LinkedList<Carrera> carreras = null;
        ArchivoCarreras archivo = new ArchivoCarreras("carreras.txt"); //nombre del archivo plano
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            asistencias = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String descripcion = tokens.nextToken();
                float precio = Float.parseFloat(tokens.nextToken());
                int existencias = Integer.parseInt(tokens.nextToken());
                carreras.add(new (codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 
            }
        }
        return carreras;

    }

    public boolean registrarCarrera(Carrera a) {
        ArchivoCarreras archivo = new ArchivoCarreras("carreras.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        ArchivoCarreras archivo = new ArchivoCarreras("carreras.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}