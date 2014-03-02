import java.math.BigDecimal;
import java.util.Date;


public class HiJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hi Java Console");
		char[] chars = {'H','i',' ','J','a','v','a'};
		String HiJava = new String(chars);
		System.out.println(HiJava);
		double dd = 1234.567;
		String ddst = Double.toString(dd);
		BigDecimal bgdc = new BigDecimal(ddst);
		System.out.println(bgdc);
		int intz = 129;
		byte bytez = (byte)intz;
		System.out.println("Integer 1024 to byte = "+bytez);
		
		String st1 = "Hi";
		String st2 = "Java";
		if (st1 == st2) {
			System.out.println("Strings Match!");
		}else {
			System.out.println("Strings Don't Match!");
		}
		String str1 = "Java";
		String str2 = "Java";
		
		if (str1.equals(str2)) {
			System.out.println("Strings Match!");
		}
		else if (str1 != str2){
			System.out.println("Strings Don't Match!");
		}
		else{
			System.out.println("Noting Above!!");
		}
		
		char a = '\uFDF2';
		char l = '\uFDFB';
		
		System.out.println(l +" "+a);
		
		Date myDates = new Date();
		System.out.println(myDates);
		
		String lol = "llooll";
		
		switch (lol) {
		case "llooll":
			System.out.println("llooll");
			break;
		case "lol":
			System.out.println("lol");
			break;
		case "llll":
			System.out.println("llll");
			break;
		default:
			System.out.println("LLOOLL");
			break;
		}
		
		
	}

}