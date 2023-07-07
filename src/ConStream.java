import java.io.*;


public class ConStream {
    public static void main (String [] args){
        FileInputStream in = null; //var ref entrada
        FileOutputStream out = null; //var ref salida
        try{
            File f = new File("prueba.txt"); //var ref a "prueba.txt"
            f.createNewFile(); //creo el archivo
            in = new FileInputStream(f); //Creo un flujo de byte desde el archivo que apunta la var ref f
            out = new FileOutputStream(f); //Creo un flujo de byte hacia el archivo que apunta la var ref f
            out.write("linea 1".getBytes()); //cargo una linea al archivo
            out.write("liena2".getBytes()); //cargo otra linea al archivo
            out = new FileOutputStream("outagain.txt"); //reciclo la var ref out a un flujo de datos hacia "outagain.txt"

            int c;
            while ((c = in.read())!=-1){
                out.write(c);
            }


        }catch(Exception e){}
       
}
}
