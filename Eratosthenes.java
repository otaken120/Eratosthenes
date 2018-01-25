/* Author: Ken Deng
 * Date: 01/25/2018
 * 
 * 
 * Week 3.
 */

import java.util.*; 

public class Eratosthenes {
	public static void main(String[] args) {
        System.out.println("Enter an integer number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Prime(number);
    }//main
    
    public static void Prime(int number) {
        //suppose an array, each element stands a mark(Y/N)
        char[] arr = new char[number + 1];
        //Y means prime，N means not a prime，initialize all elements are primes, all Y
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 'Y';
        }
        for (int i = 2; i <= number; i++) {
            if (arr[i] == 'Y') {
                //initialize i as 2, j stands for times, if a number is i*j, it must not be a prime.
                for (int j = i; j * i <= number; j++) {
                    arr[i * j] = 'N';
                }
            }//if
        }//for
        //output the results.
        for (int i = 2; i <= number; i++) {
            if (arr[i] == 'Y') {
                System.out.print(i + " ");
            }
        }//for
    }//Prime
}
