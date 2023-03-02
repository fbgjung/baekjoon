import java.util.Scanner;

public class tile_2133 {
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];

        if(N % 2 == 1){
            answer = 0;
        } else {
            dp[2] = 3;

            for(int i=4; i<=N; i+=2) {

            }
        }   
        
    }
}
