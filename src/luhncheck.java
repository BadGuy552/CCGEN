
public class luhncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int Check(String numero) {
		char[] numeros = null;
		numeros=numero.toCharArray();
		char num1 = numeros[0];
		char num2 = numeros[1];
		char num3 = numeros[2];
		char num4 = numeros[3];
		char num5 = numeros[4];
		char num6 = numeros[5];
		char num7 = numeros[6];
		char num8 = numeros[7];
		char num9 = numeros[8];
		char num10 = numeros[9];
		char num11 = numeros[10];
		char num12 = numeros[11];
		char num13 = numeros[12];
		char num14 = numeros[13];
		char num15 = numeros[14];
		
		String numero1 = String.valueOf(num1);
		String numero2 = String.valueOf(num2);
		String numero3 = String.valueOf(num3);
		String numero4 = String.valueOf(num4);
		String numero5 = String.valueOf(num5);
		String numero6 = String.valueOf(num6);
		String numero7 = String.valueOf(num7);
		String numero8 = String.valueOf(num8);
		String numero9 = String.valueOf(num9);
		String numero10 = String.valueOf(num10);
		String numero11 = String.valueOf(num11);
		String numero12 = String.valueOf(num12);
		String numero13 = String.valueOf(num13);
		String numero14 = String.valueOf(num14);
		String numero15 = String.valueOf(num15);
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		int n3 = Integer.parseInt(numero3);
		int n4 = Integer.parseInt(numero4);
		int n5 = Integer.parseInt(numero5);
		int n6 = Integer.parseInt(numero6);
		int n7 = Integer.parseInt(numero7);
		int n8 = Integer.parseInt(numero8);
		int n9 = Integer.parseInt(numero9);
		int n10 = Integer.parseInt(numero10);
		int n11 = Integer.parseInt(numero11);
		int n12 = Integer.parseInt(numero12);
		int n13 = Integer.parseInt(numero13);
		int n14 = Integer.parseInt(numero14);
		int n15 = Integer.parseInt(numero15);
	
		int c1 = n1*2;
		int cc1 = c1-9;
		int c3 = n3*2;
		int cc3 = c3-9;
		int c5 = n5*2;
		int cc5 = c5-9;
		int c7 = n7*2;
		int cc7 = c7-9;
		int c9 = n9*2;
		int cc9 = c9-9;
		int c11 = n11*2;
		int cc11 = c11-9;
		int c13 = n13*2;
		int cc13 = c13-9;
		int c15 = n15*2;
		int cc15 = c15-9;
	
	if (c1 < 9) {
		cc1=c1;
	}
	if (c3 < 9) {
		cc3=c3;
	}
	if (c5 < 9) {
		cc5=c5;
	}
	if (c7 < 9) {
		cc7=c7;
	}
	if (c9 < 9) {
		cc9=c9;
	}
	if (c11 < 9) {
		cc11=c11;
	}
	if (c13 < 9) {
		cc13=c13;
	}
	if (c15 < 9) {
		cc15=c15;
	}
	
	int sum = cc1+n2+cc3+n4+cc5+n6+cc7+n8+cc9+n10+cc11+n12+cc13+n14+cc15;
	int calc = sum*9;
	String finstr = String.valueOf(calc);
	char[] fin = null;
	fin = finstr.toCharArray();
	char nv3 = fin[2];
	String nvstr = String.valueOf(nv3);
	int nv = Integer.parseInt(nvstr);
	return nv;
	}
	
	


	
}
