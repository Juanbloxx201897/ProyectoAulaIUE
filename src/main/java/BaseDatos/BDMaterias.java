import Clases.Materias;
import java.util.LinkedList;
import java.util.StringTokenizer;
import BaseDatos.ArchivoMaterias;

public class BDMaterias{

    public LinkedList<Materias> obtener() {
        LinkedList<Materias> materias = null;
        ArchivoMaterias archivo = new ArchivoMaterias("materias.txt"); //nombre del archivo plano
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
                materias.add(new (codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 
            }
        }
        return materias;

    }

    public boolean registrarMaterias(Materias a) {
        ArchivoMaterias archivo = new ArchivoMaterias("materias.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        ArchivoMaterias archivo = new ArchivoMaterias("materias.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}