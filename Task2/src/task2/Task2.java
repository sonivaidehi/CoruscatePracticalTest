/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Vaidehi
 */
public class Task2 {

    public static void main(String[] args) {
        
        int noOfTestcases = 0;
        //Flag for  contraint of no of testcase
        boolean noOfTestCase_flag = false;
        //Stream for taking input
        Scanner sc = new Scanner(System.in);
        Collection<TrainCompartment> collectionOfTestCases = new ArrayList<TrainCompartment>();
        
        do{
            noOfTestcases = sc.nextInt();
            //checking constraint on no of testcases
            if(!(noOfTestcases>=1 && noOfTestcases<=105)){
                //if not fulfilled then displays error and ask for other input
                System.out.println("No. of Testcases should between 1 to 105");
                noOfTestCase_flag = true;
            }else{
                noOfTestCase_flag = false;
                
                //take inout for test cases
                for(int i=0;i<noOfTestcases;i++){
                    boolean seatNo_flag = false;
                    do{
                        int passangeSeatNo = sc.nextInt();
                        //checking constaints on seat number
                        if(!(passangeSeatNo>=1 && passangeSeatNo<=108)){
                            //if not fulfilled then displays error and ask for other input
                            System.out.println("Seat Number of passager should between 1 to 108");
                            seatNo_flag = true;
                        }else{
                            seatNo_flag = false;
                        }
                        //if user's input is valid then add testcase into collection
                        if(seatNo_flag == false){
                            TrainCompartment testcase = new TrainCompartment(passangeSeatNo);
                            collectionOfTestCases.add(testcase);
                        }
                    }while(seatNo_flag);
                    
                }
            }
            
            
            
        }while(noOfTestCase_flag);
        
        //finally call function to display results
        for(TrainCompartment tc: collectionOfTestCases){
            tc.calculateFacingSeatNoAndSeatType();
        }
    }
    
}
