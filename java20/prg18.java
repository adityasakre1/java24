import java.io.File
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class CopyContent
{
    public static void main(String[] args) throws IOException
    {
        File File = new File("C:\\test\\inputFile.txt");
        FileInputStream inputStream=new FileInputStream(File);
        StringBuffer buffer=new StringBuffer();
        while(sc.hasNext())
        {
            buffer.append(""+sc.nextLine());
        } 
        
        
        System.out.println("Contents of the file: "+buffer);
        File dest = new File("C:\\test\\outputFile.txt");
        FileWriter writer = new FileWriter(dest);
        writer.writer(buffer.toString());
        writer.close();
        System.out.println("File copied successfully.....");
    }
}























        ......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................















































































































































































































































































































































































































































































































































































































































        ...........................












        ...............................







































































































