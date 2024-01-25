
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
			
			String row = br.readLine();
			int a1 = 0;
			int a2 = 0;
			String view = "";
			
			while ( !"".equals( row ) ) {
				a1 = Integer.parseInt( row.split(" ")[0] );
				a2 = Integer.parseInt( row.split(" ")[1] );
				if (a1 == 0 && a2 == 0) {
					break;
				}
				view = returnResult(a1, a2);
				System.out.println(view);
				row = br.readLine();
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if ( br != null ) { br.close(); }
			if ( isr != null ) { isr.close(); }
		}
		
		
	}

	private static String returnResult(int a1, int a2) {
		String reword = null;
		if ( a1 / a2 == 0 ) {
			reword = "factor";
		} else if( a1 % a2 == 0 ){
			reword = "multiple";
		} else if( a1 == a2 ){
			
		} else {
			reword = "neither";
		}
		return reword;
	}
	
}


