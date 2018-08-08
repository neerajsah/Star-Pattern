/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *
 * @author neerajsah
 */
public class Pyramid {
    
    public static void main(String[] args) 
    {
         int number = 5;
        int count = number - 1;
        for (int k = 1; k <= number - 1; k++)
        {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (int i = 1; i <= 2 * (number-1 - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        number=3;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count-2; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        
        
    }
    
}
