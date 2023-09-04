    package laboratiorio.pkg3;
    
public class Persona {
    
    private String Nombre;
    private String Apellido;
    private String Dni;
    
    public Persona(){}
    
    public Persona(String Nombre, String Apellido, String Dni)
    {   this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;}
    
    
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    
   
    
}
