import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine(), " ");
        
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(stN.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<M; i++){
            int X = Integer.parseInt(stM.nextToken());
            int isPresent = 0;
            for(int numA : A){
                if(numA == X){
                    isPresent = 1;
                    break;
                }
            }
            System.out.println(isPresent);
        }
    }
}
