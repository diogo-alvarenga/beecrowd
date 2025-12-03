import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int horas = num/3600;
    int resto = num%3600;
    int minutos = resto/60;
    int segundos = resto%60;
    

    System.out.println(horas+":"+minutos+":"+segundos);
        
    }
 
}