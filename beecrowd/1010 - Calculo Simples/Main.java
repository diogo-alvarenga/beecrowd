import java.io.IOException;
import java.util.Scanner;
public class Main {
    static String input1;
    static String input2;
    
    static double total;
    static String totalFormatado;
    public static void main(String[] args) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    input1 = sc.nextLine();
    input2 = sc.nextLine();
    String[] lista1 = input1.split(" ");
    String[] lista2 = input2.split(" ");
 
    total = ((Double.parseDouble(lista1[1])) * (Double.parseDouble(lista1[2])) + (Double.parseDouble(lista2[1])) * (Double.parseDouble(lista2[2])));
    
    totalFormatado = String.format("%.2f",total);
    
    System.out.println("VALOR A PAGAR: R$ "+totalFormatado);    
    }
 
}