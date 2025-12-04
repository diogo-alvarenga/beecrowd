import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int nFuncionario = sc.nextInt();
        int horaTrabalhada = sc.nextInt();
        double valorHora = sc.nextDouble();
        
        double total = horaTrabalhada*valorHora;
        String totalf = String.format("%.2f", total);
        
        System.out.println("NUMBER = "+nFuncionario);
        System.out.println("SALARY = U$ "+totalf);
    }
 
}