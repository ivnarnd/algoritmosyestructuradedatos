package tp1.ejercicio3;

public class Profesor {
    private String nombre;
    private String apellido;
    private String catedra;
    private String email;
    private String facultad;


    public Profesor(String nombre,String apellido,String catedra,String email,String facultad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.catedra = catedra;
        this.email = email;
        this.facultad = facultad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCatedra(String catedra){
        this.catedra = catedra;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setFacultad(String facultad){
        this.facultad = facultad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCatedra(){
        return this.catedra;
    }
    public String getEmail(){
        return this.email;
    }
    public String getFacultad(){
        return this.facultad;
    }

    public String tusDatos(){
        return this.getNombre()+" "+this.getApellido()+" "+this.getCatedra()+" "+this.getEmail()+" "+this.getFacultad();
    }
}

