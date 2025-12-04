import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;       
        double raio = sc.nextDouble();
        
        double area = n*(raio*raio);
        
        String areaF = String.format("%.4f",area);
        
        System.out.println("A="+areaF);
    }
 
}