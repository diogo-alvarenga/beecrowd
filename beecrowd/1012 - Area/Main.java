import java.io.IOException;
import java.util.Scanner; 

public class Main {
    static double a;
    static double b;
    static double c;
    static double pi = 3.14159;
    static String conteudo;
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    
    conteudo = sc.nextLine();
    
    String[] lista = conteudo.split(" ");
    
    a = Double.parseDouble(lista[0]);
    b = Double.parseDouble(lista[1]);
    c = Double.parseDouble(lista[2]);
    
    double triangulo = (a*c)/2;
    double circulo = pi * Math.pow(c, 2);
    double trapezio = (a+b)*c/2;
    double quadrado = b*b;
    double retangulo = a*b;
    System.out.println("TRIANGULO: "+String.format("%.3f",triangulo));
    System.out.println("CIRCULO: "+String.format("%.3f",circulo));
    System.out.println("TRAPEZIO: "+String.format("%.3f",trapezio));
    System.out.println("QUADRADO: "+String.format("%.3f",quadrado));
    System.out.println("RETANGULO: "+String.format("%.3f",retangulo));
        
    }
 
}