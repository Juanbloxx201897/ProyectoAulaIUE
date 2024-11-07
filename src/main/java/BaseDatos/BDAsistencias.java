import Clases.Asistencias;
import java.util.LinkedList;
import java.util.StringTokenizer;
import BaseDatos.ArchivoAsistencias;

public class BDAsistencias{

    public LinkedList<Asistencias> obtener() {
        LinkedList<Asistencias> asistencias = null;
        ArchivoAsistencias archivo = new ArchivoAsistencias("asistencias.txt"); //nombre del archivo plano
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
                asistencias.add(new (codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 
            }
        }
        return asistencias;

    }

    public boolean registrarAsistencia(Asistencias a) {
        ArchivoAsistencias archivo = new ArchivoAsistencias("asistencias.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        ArchivoAsistencias archivo = new ArchivoAsistencias("asistencias.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}