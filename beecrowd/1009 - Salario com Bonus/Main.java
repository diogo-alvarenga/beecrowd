import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String nome;
    static double salarioFixo;
    static double totalVendas;
    static double totalSalario;
    public static void main(String[] args) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    
    nome = sc.nextLine();
    salarioFixo = sc.nextDouble();
    totalVendas = sc.nextDouble();
    
    totalSalario = salarioFixo+(totalVendas*0.15);
    
    String salarioFormatado = String.format("%.2f",totalSalario);
    
    System.out.println("TOTAL = R$ "+salarioFormatado);
    
    }
 
}