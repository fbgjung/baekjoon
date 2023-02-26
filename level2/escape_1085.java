package level2;
import java.util.Arrays;
import java.util.Scanner;

public class escape_1085{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[4];
        
        int x = sc.nextInt(); 
        int y = sc.nextInt();  
        int w = sc.nextInt();
        int h = sc.nextInt();
       
        int len1 = h-y;
        int len2 = w-x;

        array[0] = len1;
        array[1] = x;
        array[2] = len2;
        array[3] = y;

        Arrays.sort(array);
        
        System.out.println(array[0]);

        sc.close();
    }
}