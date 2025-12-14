package tp1.ejercicio3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String comision;
    private String email;
    private String direccion;


    public Estudiante(String nombre,String apellido,String comision,String email,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.comision = comision;
        this.email = email;
        this.direccion = direccion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setComision(String comision){
        this.comision = comision;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getComision(){
        return this.comision;
    }
    public String getEmail(){
        return this.email;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public String tusDatos(){
        return this.getNombre()+" "+this.getApellido()+" "+this.getComision()+" "+this.getEmail()+" "+this.getDireccion();
    }
}

