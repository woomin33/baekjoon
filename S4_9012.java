import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class S4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < T; i++) {
			sb.append(solve(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
    }

    public static String solve(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }
            else if(stack.empty()){
                return "NO";
            }
            else{
                stack.pop();
            }

            
        }
        if(stack.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
