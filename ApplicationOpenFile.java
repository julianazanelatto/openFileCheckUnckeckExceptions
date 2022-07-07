import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ApplicationOpenFile{

    static void readFile (String fileName) throws FileNotFoundException, IOException{
        
        try{
            FileReader file = new FileReader(fileName);
            readingFile(file);
        }catch(FileNotFoundException fnf){
            System.out.println("File not found. Please, try again!");
            throw new FileNotFoundException();
        }finally{
            System.out.println("Ending the program");
        }
        
    }

    static void readingFile (FileReader file) throws IOException{
        BufferedReader bReaderFile = new BufferedReader(file);
        String fileLine = bReaderFile.readLine();

        while(fileLine != null){
            System.out.println(fileLine);
        }
        bReaderFile.close();

    }
    
    public static void main(String[] args) throws IOException{
        System.out.println("Hello World");
        readFile("arquivo.txt");
    }

}