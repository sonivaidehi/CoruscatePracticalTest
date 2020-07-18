/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import task1.ChocolateDistribution;

/**
 *
 * @author Vaidehi
 */

public class Task1 {

    public static void main(String[] args) {

        int noOfTestcases = 0;
        //Flag for  contraint of no of testcase
        boolean noOfTestCase_flag = false;
        //Stream for taking input
        Scanner sc = new Scanner(System.in);
        Collection<ChocolateDistribution> collectionOfTestCases = new ArrayList<ChocolateDistribution>();
        
        do {
            //taking input for No. of Test cases
            noOfTestcases = sc.nextInt();
            //Applying constraints
            
            //if entered No Of Testcase is not between 1 to 10
            if (!(noOfTestcases >= 1 && noOfTestcases <= 10)) {
                //No Of Testcases not fulfilling criteria then  displays error and It will take another inout from user
                System.out.println("No. of test cases should between 1 to 10");
                noOfTestCase_flag = true;
            } else {
                
                
                noOfTestCase_flag = false;
                
                //take input for testcases
                for (int i = 0; i < noOfTestcases; i++) {
                    //flag for contraint on no of chocolate
                    boolean chocolate_flag = false;
                    //flag for contraint on no of students
                    boolean student_flag = false;
                    
                    do {
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.nextLine();

                        String[] separateInput = input.split(" ",2);
                        
                        int noOfChocolates = Integer.parseInt(separateInput[0]);
                        int noOfStudents = Integer.parseInt(separateInput[1]);
                        
                        //no of chocolate not fulfilling criteria to between 1 to 1000
                        if (!(noOfChocolates >= 1 && noOfChocolates <= 1000)) {
                            //if entered wrong then displays error and again ask for input
                            System.out.println("No . of Chocolates should between 1 to 1000");
                            chocolate_flag = true;
                        } else {
                            chocolate_flag = false;
                        }
                        //no of students not fulfilling criteria to between 1 to 100
                        if (!(noOfStudents >=1 && noOfChocolates <=100)) {
                            //if entered wrong then displays error and again ask for input
                            System.out.println("No . of Students should between 1 to 100");
                            student_flag = true;
                        } else {
                            student_flag = false;
                        } 
                        
                        // if input entered by user is correct then add that into collection
                        if(student_flag == false && chocolate_flag == false){
                            ChocolateDistribution testcase = new ChocolateDistribution(noOfChocolates,noOfStudents);
                            collectionOfTestCases.add(testcase);
                        }
                        
                        
                    } while (chocolate_flag && student_flag);

                    
                }
            }
        } while (noOfTestCase_flag);

        //print final result of no of minimum chocolate left
        for(ChocolateDistribution cd: collectionOfTestCases){
            cd.findMinimumChocolateLeft();
        }

    }

}
