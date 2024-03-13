import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class S4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num;
        int sum = 0;

        for(int i=0; i<K; i++){
            num = Integer.parseInt(br.readLine());
            if(num == 0 && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        int stack_size = stack.size();
        for(int i=0; i<stack_size; i++){
            sum += stack.pop();
        }
        System.out.println(sum);
        
    }
}
