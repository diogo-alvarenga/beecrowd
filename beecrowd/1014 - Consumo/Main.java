import java.io.IOException;
import java.util.Scanner;
public class Main {
    static int km;
    static double gasto;
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();
        gasto = sc.nextDouble();
        
        double total = km / gasto;
        
        String formatado = String.format("%.3f",total);
        
        System.out.println(formatado+" km/l");
    
    }
 
}