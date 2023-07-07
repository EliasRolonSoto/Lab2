import java.io.*;

public class BufferedReader implements Serializable {
    
    public BufferedReader(FileReader fileReader) {
    }

    public static void main(String[]args)throws Exception{

        BufferedReader in = null;
        BufferedWriter out = null;
        try{
        File f = new File("prueba.txt"); //creo la var ref
        f.createNewFile(); //creo el archivo 
        in = new BufferedReader(new FileReader(f));
        out = new BufferedWriter(new FileWriter(f));
        out.write("linea1");
        out.newLine();
        out.write("linea2");
        out.close();
        out = new BufferedWriter(new FileWriter("otro.txt"));
        
        String aux = "";
        while((aux = in.readLine())!=null){
            System.out.println(aux);
            out.write(aux);
            out.newLine();

        }

    }catch(Exception e){
        e.printStackTrace();
    }

}

    private String readLine() {
        return null;
    }
}
