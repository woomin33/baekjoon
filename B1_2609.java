import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class B1_2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);
 
	    System.out.println(d);
		System.out.println(a * b / d);
    } 

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b); 
    }
}
