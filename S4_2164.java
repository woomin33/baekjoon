import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class S4_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<Integer>();

        for(int i=0; i<N; i++){
            que.offer(i+1);
        }
        while(que.size() > 1){
            que.poll();
            que.offer(que.poll());
        }
        System.out.println(que.peek());
    }
}
