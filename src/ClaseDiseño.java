
import java.io.*;

public class ClaseDiseño implements Serializable{
    private String tipo;
    private String marca;
    private double rodado;

    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setRodado(double rodado) {
        this.rodado = rodado;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getRodado() {
        return rodado;
    }
    public ClaseDiseño() {}

    @Override
    public String toString() {
        return "ClaseDiseño [tipo=" + tipo + ", marca=" + marca + ", rodado=" + rodado + "]";
    }


    
    
}