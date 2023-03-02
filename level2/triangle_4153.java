package level2;

import java.util.Scanner;

public class triangle_4153 {
    static int x;
    static int y;
    static int z;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt(); 
            
            if(x==0 && y == 0 && z==0) break;
        
        if(x+y>z){
            System.out.println("right");
        }
        else if(y+z>x){
            System.out.println("right");
        }
        else if(x+z>y){
            System.out.println("right");
        } else{
            System.out.println("wrong");
        }

        }

        
    
    }

    
}
