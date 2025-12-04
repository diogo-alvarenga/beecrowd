import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    
    String linha = sc.nextLine();
    
    String[] array = linha.split(" ");
    
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);
    int c = Integer.parseInt(array[2]);
    
    int MaiorAB = (a+b+ Math.abs(a-b))/2;
    int MaiorFinal = (MaiorAB+c+ Math.abs(MaiorAB-c))/2;
    
    if(MaiorAB> MaiorFinal){
        System.out.println(MaiorAB+" eh o maior");
    }else{
        System.out.println(MaiorFinal+" eh o maior");    
    }
    }
 
}