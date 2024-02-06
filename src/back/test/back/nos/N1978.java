package back.test.back.nos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1978 {


  public static void main(String[] args) throws IOException {

    InputStreamReader isr = null;
    BufferedReader br = null;
    try {
      isr = new InputStreamReader(System.in);
      br = new BufferedReader(isr);
      StringBuffer sb;
      int row = Integer.parseInt( br.readLine() );

      int cnt = 0;
      int now = 0;;;


      for (int i = 0; i < row; i++) {
 
        now = Integer.parseInt( br.readLine().split(" ")[i] );

        System.out.println(now);


      }



    } catch (Exception e) {
      System.out.println(e);
    } finally {
      if ( br != null ) { br.close(); }
      if ( isr != null ) { isr.close(); }
    }

  }


}