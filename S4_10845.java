import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S4_10845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    que.offer(last);
                    break;
                case "pop":
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.poll()).append("\n");
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.peek()).append("\n");
                    break;
                case "back":
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
