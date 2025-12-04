import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        double MEDIA = ((a*3.5)+(b*7.5))/11;
        
        String MEDIAF = String.format("%.5f", MEDIA);
        
        System.out.println("MEDIA = "+MEDIAF);
        
    }
 
}