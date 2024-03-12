import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class S4_10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        int X = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push_front":
                    X = Integer.parseInt(st.nextToken());
                    deque.offerFirst(X);
                    break;
                case "push_back":
                    X = Integer.parseInt(st.nextToken());
                    deque.offerLast(X);
                    break;
                case "pop_front":
                    if(deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.peekFirst()).append("\n");
                    break;
                case "back":
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
