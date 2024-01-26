import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			StringBuffer sb;
			int row = Integer.parseInt( br.readLine() );
			
			int money = 0;
			
			int a1 = 25;
			int a2 = 10;
			int a3 = 5;
			int a4 = 1;
			for (int i = 0; i < row; i++) {
				money = Integer.parseInt( br.readLine() );
				sb =  new StringBuffer();
				
//				System.out.println(money);
//				System.out.println( money / a1 );
				sb.append( money / a1 + " "  );
				money = money - (money / a1) * a1;
//				System.out.println( money / a2 );
				sb.append( money / a2 + " "  );
				money = money - (money / a2) * a2;
//				System.out.println( money / a3 );
				sb.append( money / a3 + " "  );
				money = money - (money / a3) * a3;
//				System.out.println( money / a4 );
				sb.append( money / a4 + " "  );
				money = money - (money / a4) * a4;
				
				System.out.println(sb.toString());
//				break;
			}
			

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if ( br != null ) { br.close(); }
			if ( isr != null ) { isr.close(); }
		}
		
		
	}
	
}


