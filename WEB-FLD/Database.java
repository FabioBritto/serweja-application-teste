import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static void add(String s){

        try{
            FileWriter f = new FileWriter("data.txt",true);
            PrintWriter pr = new PrintWriter(f);
            pr.println(s);
            pr.close();
            f.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<String> recuperar(){
        try{
            FileReader f = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(f);
            String linha;
            List<String> lista = new ArrayList<>();
            while((linha = br.readLine()) != null){
                lista.add(linha);
            }
            br.close();
            f.close();
            return lista;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
