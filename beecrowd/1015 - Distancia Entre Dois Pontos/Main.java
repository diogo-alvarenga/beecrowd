import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    
    String conteudo1 = sc.nextLine();
    String conteudo2 = sc.nextLine();
    
    String[] lista1= conteudo1.split(" ");
    String[] lista2= conteudo2.split(" ");
    
    double x1 = Double.parseDouble(lista1[0]);
    double y1 = Double.parseDouble(lista1[1]);
    
    double x2 = Double.parseDouble(lista2[0]);
    double y2 = Double.parseDouble(lista2[1]);
    
    double x = x2 - x1;
    double y = y2 - y1;
    
    double total = Math.sqrt((x*x)+(y*y));
    
    String tFormat = String.format("%.4f",total);
    
    System.out.println(tFormat);
    }
 
}