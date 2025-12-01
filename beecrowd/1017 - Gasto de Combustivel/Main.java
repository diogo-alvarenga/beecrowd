import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    double tempo = sc.nextInt();
    double velocidade = sc.nextInt();
    
    double distancia = (tempo*velocidade) /12;
    
    String distanciaFormatada = String.format("%.3f", distancia);
    
    System.out.println(distanciaFormatada);
    }
 
}