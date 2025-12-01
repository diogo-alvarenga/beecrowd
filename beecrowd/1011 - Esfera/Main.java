import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    double pi =  3.14159;
    double raio;
    double total;
    raio = sc.nextDouble();
    
    total = ((4/3.0)* pi) * Math.pow(raio, 3);
    
    String totalF = String.format("%.3f",total);
    System.out.println("VOLUME = "+totalF);
    }
}