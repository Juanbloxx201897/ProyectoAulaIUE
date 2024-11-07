package Clases;

public class Alumno extends Persona{
    
    String codigo;

    public Alumno(String Nombre, int Edad, String NumeroTelefono, String CorreoInstitucional) {
        super(Nombre, Edad, NumeroTelefono, CorreoInstitucional);
    }

   

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public void CalcularPromedios() {
     
    
    }
    
    
}
