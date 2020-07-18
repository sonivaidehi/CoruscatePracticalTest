/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
import task1.ChocolateDistribution;
/**
 *
 * @author Vaidehi
 */

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int noOfTestcases = 0;
        //Stream for taking input
        Scanner sc= new Scanner(System.in); 
        
        //taking input for No. of Test cases
        System.out.println("Enter No. of Testcases: ");
        noOfTestcases = sc.nextInt();
        
        //Take input for testcases
        for(int i = 0; i<noOfTestcases;i++){
            System.out.println("Enter No. of Chocolate:  ");
            int c = sc.nextByte();
            System.out.println("Enter No. Of Student: ");
            int n = sc.nextInt();
            
            //creating instance of a class
            ChocolateDistribution testcase = new ChocolateDistribution(c,n);
            //calling method to calculate minimum no. of Chocolate left
            testcase.findMinimumChocolateLeft();
        }
        
    }
    
}
