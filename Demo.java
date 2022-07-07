import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Demo {
    public static void main(String[] args){
        try{
            String Data = ("2nd Line Contant");
            File f0 = new File("C:/java/javafileoperation.txt");
            if(!f0.exists()){
                f0.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(f0.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(Data);
            bw.close();
            System.out.println("Data Append in Existing File");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
