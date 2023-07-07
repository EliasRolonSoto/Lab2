import java.io.*;

public class FileReWri {
    public static void main (String [] args){

        char[] in = new char[50]; //simulo el String con un array de char
        int size = 0;

        try{
            File file = new File("fileWrite2.txt");
            FileWriter fw = new FileWriter(file); //crea el file writer que escribe en el archivo al cual apunta "file"
            
            fw.write("Ejemplo de entrada por teclado");
            fw.flush(); //limpia el canal
            fw.close(); //cierra el archivo

            FileReader fr = new FileReader(file);

            size = fr.read(in); //lee el tamaño del archivo
            System.out.println(size + ""); //dice cuantos bytes leyó
            for (char c: in)
            System.out.print(c);
            fr.close();    
        }catch(IOException e){}
    }
    
}
