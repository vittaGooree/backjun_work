import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N2581 {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		/**
		 * 1. 소수 목록 뽑기
		 * 2. 소수들 합 출력
		 * 3. 최소 소수 출력
		 */
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
//			String row = br.readLine();
			int a = Integer.parseInt( br.readLine() ); 
			int b = Integer.parseInt( br.readLine() );
			boolean flag = false;
			
			int sum = 0;
			
			List<Integer> list = new ArrayList<Integer>();
			for (int i = a; i <= b; i++) {
				
				flag = isPrime( i );
				
				if (flag) {
					list.add( i );
					sum += i;
				}
			}
			
			if (list.size() == 0) {
				System.out.println(-1);
			}else {
				System.out.println(sum);
				System.out.println(list.get(0));
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

	/**
	 * 나눗셈으로 구하기 by 제곱근으로
	 * @param i
	 * @return
	 */
	private static boolean isPrime(int num) {
		if ( num == 1 ) {
			return false;
		}
		
		int sqrt = (int)Math.sqrt(num);
		for (int i = 2; i <= sqrt; i++) {
			if ( num % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}
}
