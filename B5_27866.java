import java.util.Scanner;

public class B5_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(S.charAt(i-1));
        sc.close();
    }
}