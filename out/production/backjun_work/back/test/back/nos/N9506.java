import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String text = null;
			
			// 입력한 값이 소수인지 확인하기
			int sosu = 0;
			int cnt = 1;
			List<Integer> list = null;
			for (int i = 1; i <= cnt; i++) {
				sosu = Integer.parseInt( br.readLine() );
				if (sosu == -1) {
					break;
				} else {
					cnt++;
				}
				
				list = new ArrayList<Integer>();
				for (int j = 1; j < sosu; j++) {
					if (sosu % j == 0) {
						list.add(j);
					}
				}
				
				int listsum = 0;
				for (int j = 0; j < list.size(); j++) {
					listsum += list.get(j);			
				}
				
				text = "";
				if ( sosu == listsum ) {
					text += sosu + " = "; 
					for (int j = 0; j < list.size(); j++) {
						text += list.get(j);
						if ( j+1 != list.size()) {
							text += " + ";
						}
					}
				} else {
					text = sosu + " is NOT perfect.";
				}
				System.out.println( text );
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if ( br != null ) {
				try { br.close(); } catch (IOException e) { System.out.println(e); } 
			}
			if ( isr != null ) {
				try { isr.close(); } catch (IOException e) { System.out.println(e); } 
			}
		}
		
		
	}
	
	
}
