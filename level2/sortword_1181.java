package level2;
import java.util.Scanner;

public class sortword_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] array = new String[N+1];

        for(int i = 0; i<=N; i++) {
            array[i] = sc.nextLine();
        }

        for(int i = 0; i<=N; i++) {
            System.out.println(array[i]);
        }

        
        sc.close();

    }
    
}
