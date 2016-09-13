package number;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
    int response = 0;
        
        do
        {
            System.out.println("Enter number");
            int x = input.nextInt();
            System.out.println(Integer.toBinaryString(x));
            
        }
        while (response == 'y');
    }
    
}
