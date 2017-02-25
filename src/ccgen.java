import java.util.Random;

public class ccgen extends luhncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String bin=args[0];
			int ccgennumber = Integer.parseInt(args[1]);
		ccgen(bin, ccgennumber);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public static void ccgen(String bin, int gennumber) {
		Random ccn1 = new Random();
		Random ccn2 = new Random();
		Random ccn3 = new Random();
		Random ccn4 = new Random();
		Random ccn5 = new Random();
		Random ccn6 = new Random();
		Random ccn7 = new Random();
		Random ccn8 = new Random();
		Random ccn9 = new Random();
		Random ccn10 = new Random();
		Random ccn11 = new Random();
		Random ccn12 = new Random();
		Random ccn13 = new Random();
		Random ccn14 = new Random();
		Random ccn15 = new Random();
		for (int idx = 1; idx <= gennumber; ++idx){
		      int ccr1 = ccn1.nextInt(10);
		      int ccr2 = ccn2.nextInt(10);
		      int ccr3 = ccn3.nextInt(10);
		      int ccr4 = ccn4.nextInt(10);
		      int ccr5 = ccn5.nextInt(10);
		      int ccr6 = ccn6.nextInt(10);
		      int ccr7 = ccn7.nextInt(10);
		      int ccr8 = ccn8.nextInt(10);
		      int ccr9 = ccn9.nextInt(10);
		      int ccr10 = ccn10.nextInt(10);
		      int ccr11 = ccn11.nextInt(10);
		      int ccr12 = ccn12.nextInt(10);
		      int ccr13 = ccn13.nextInt(10);
		      int ccr14 = ccn14.nextInt(10);
		      int ccr15 = ccn15.nextInt(10);
		      int validademesrandom = ccn15.nextInt(13);
		      String random1 = String.valueOf(ccr1);
		      String random2 = String.valueOf(ccr2);
		      String random3 = String.valueOf(ccr3);
		      String random4 = String.valueOf(ccr4);
		      String random5 = String.valueOf(ccr5);
		      String random6 = String.valueOf(ccr6);
		      String random7 = String.valueOf(ccr7);
		      String random8 = String.valueOf(ccr8);
		      String random9 = String.valueOf(ccr9);
		      String random10 = String.valueOf(ccr10);
		      String random11 = String.valueOf(ccr11);
		      String random12 = String.valueOf(ccr12);
		      String random13 = String.valueOf(ccr13);
		      String random14 = String.valueOf(ccr14);
		      String random15 = String.valueOf(ccr15);
		      String validademesstr = null;
		      int v = ccn10.nextInt(10);
		      if (validademesrandom < 10) {
		    	  validademesstr = String.valueOf(validademesrandom);
		    	  validademesstr = 0 + validademesstr;
		      } else {
		    	  validademesstr = String.valueOf(validademesrandom);
		      }
		      
		      String cvv = random10 + random11 + random12;
		      if (v < 7) {
		    	  int resto = 7-v;
		    	  v=resto+v;
		      }
		      
		      String validadeano = "201" + v;
		     String cc = bin + random1 + random2 + random3 + random4 + random5 + random6 + random7 + random8 + random9;
		     int nv = Check(cc);
		     System.out.println(cc + nv + "|" + validademesstr + "|" + validadeano + "|" + cvv);
		}
	}
}
