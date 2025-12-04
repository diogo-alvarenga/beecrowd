import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();    
        
        int anos = 0;
        int meses = 0;
        int dias =0;
        while(input>=365){
            input = input - 365;
            anos++;
        }
        while(input>=30){
            input = input - 30;
            meses++;
        }
        while(input>=1){
            input = input - 1;
            dias++;
        }
        
        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");
 
    }
 
}