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
			a1 = Integer.parseInt( row.split(" ")[0] );
			a2 = Integer.parseInt( row.split(" ")[1] );
			
			int view = returnResult(a1, a2);
			System.out.println(view);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if ( br != null ) { br.close(); }
			if ( isr != null ) { isr.close(); }
		}
		
		
	}

	private static int returnResult(int a1, int a2) {
		int reword = 0;
		int a3 = 0;
		for (int i = 1; i <= a1; i++) {
			if ( a1%i == 0 ) {
				a3++;
				if (a3 == a2) {
					reword = i;
					break;
				}
			}
		}
		//if (a3 < a2) {
		//	reword = 0;
		//}
		return reword;
	}
	
}


