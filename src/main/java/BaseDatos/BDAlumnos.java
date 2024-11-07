import Clases.Alumno;
import java.util.LinkedList;
import java.util.StringTokenizer;
import BaseDatos.ArchivoAlumnos;

public class BDAlumnos{

    public LinkedList<Alumno> obtener() {
        LinkedList<Alumno> alumnos = null;
        ArchivoAlumnos archivo = new ArchivoAlumnos("alumnos.txt"); //nombre del archivo plano
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            alumnos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String descripcion = tokens.nextToken();
                float precio = Float.parseFloat(tokens.nextToken());
                int existencias = Integer.parseInt(tokens.nextToken());
                alumnos.add(new (codigo, nombre, descripcion, precio, existencias)); //se ponen los atributos de la clase 
            }
        }
        return alumnos;

    }

    public boolean registrarAlumno(Alumno a) {
        ArchivoAlumnos archivo = new ArchivoAlumnos("asistencias.txt"); // nombre del archivo plano
        return archivo.registrar(a.getCodigo() + ";" + a.getNombre() + ";" + a.getDescripcion()
                + ";" + a.getPrecio() + ";" + a.getExistencias());
    }

    public boolean borrarTodo() {
        ArchivoAlumnos archivo = new ArchivoAlumnos("alumnos.txt"); //nombre del archivo plano 
        return archivo.borrarContenido();
    }

}
