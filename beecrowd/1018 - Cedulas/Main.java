import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		int valor = sc.nextInt();
		int valorInicial = valor;
		int quant100=0;
		int quant50= 0;
		int quant20= 0;
		int quant10= 0;
		int quant5= 0;
		int quant2= 0;
		int quant1= 0;


		while(valor>=100) {
			valor = valor -100;
			quant100++;
		}
		while(valor>=50) {
			valor = valor -50;
			quant50++;
		}
		while(valor>=20) {
			valor = valor -20;
			quant20++;
		}
		while(valor>=10) {
			valor = valor -10;
			quant10++;
		}
		while(valor>=5) {
			valor = valor -5;
			quant5++;
		}
		while(valor>=2) {
			valor = valor -2;
			quant2++;
		}
		while(valor>=1) {
			valor = valor -1;
			quant1++;
		}
		System.out.println(valorInicial);
		System.out.println(quant100+" nota(s) de R$ 100,00");
		System.out.println(quant50+" nota(s) de R$ 50,00");
		System.out.println(quant20+" nota(s) de R$ 20,00");
		System.out.println(quant10+" nota(s) de R$ 10,00");
		System.out.println(quant5+" nota(s) de R$ 5,00");
		System.out.println(quant2+" nota(s) de R$ 2,00");
		System.out.println(quant1+" nota(s) de R$ 1,00");

	}

}