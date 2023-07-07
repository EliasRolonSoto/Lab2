import java.io.*;

public class SerializacionPadre implements Serializable {
    private String nombre;
    private String raza;
    



    public SerializacionPadre(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public String toString() {
        return "SerializacionPadre [nombre=" + nombre + ", raza=" + raza + "]";
    }

    
    
}
