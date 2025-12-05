import java.io.IOException;
import java.util.Scanner;
public class Main {

    static double valor;
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int quant100 = 0;
		int quant50 = 0;
		int quant20 = 0;
		int quant10 = 0;
		int quant5 = 0;
		int quant2 = 0;
		int quant1 = 0;

		int quant050 = 0;
		int quant025 = 0;
		int quant010 = 0;
		int quant005 = 0;
		int quant001 = 0;

		valor = sc.nextDouble();

		quant100 = calculo(100,quant100);
		quant50 = calculo(50,quant50);
		quant20 = calculo(20,quant20);
		quant10 = calculo(10,quant10);
		quant5 = calculo(5,quant5);
		quant2 = calculo(2,quant2);
		quant1 = calculo(1,quant1);
		
		quant050 = calculo(0.50,quant050);
        quant025 = calculo(0.25,quant025);
        quant010 = calculo(0.10,quant010);
        quant005 = calculo(0.05,quant005);
        quant001 = calculo(0.01,quant001);
        
        System.out.println("NOTAS:");
        System.out.println(quant100+ " nota(s) de R$ 100.00");
        System.out.println(quant50+ " nota(s) de R$ 50.00");
        System.out.println(quant20+ " nota(s) de R$ 20.00");
        System.out.println(quant10+ " nota(s) de R$ 10.00");
        System.out.println(quant5+ " nota(s) de R$ 5.00");
        System.out.println(quant2+ " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(quant1+ " moeda(s) de R$ 1.00");
        System.out.println(quant050+ " moeda(s) de R$ 0.50");
        System.out.println(quant025+ " moeda(s) de R$ 0.25");
        System.out.println(quant010+ " moeda(s) de R$ 0.10");
        System.out.println(quant005+ " moeda(s) de R$ 0.05");
        System.out.println(quant001+ " moeda(s) de R$ 0.01");
	}

	public static int calculo(int valorMenos, int vezes) {
		while(valor>=valorMenos) {
			valor = valor - valorMenos;
		    valor = Math.round(valor * 100.0) / 100.0;
		    vezes++;
		}
		return vezes;
	}
	public static int calculo(double valorMenos, int vezes) {
		while(valor>=valorMenos) {
			valor = valor - valorMenos;
			valor = Math.round(valor * 100.0) / 100.0;
			vezes++;
		}
		return vezes;
	}

}