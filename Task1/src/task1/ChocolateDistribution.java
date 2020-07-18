/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Vaidehi
 */
public class ChocolateDistribution {

    //variables
    private int noOfChocolate;
    private int noOfStudents;
    private int minimumChocolateLeft;

    //getter and setters
    public int getNoOfChocolate() {
        return noOfChocolate;
    }

    public void setNoOfChocolate(int noOfChocolate) {
        this.noOfChocolate = noOfChocolate;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getMinimumChocolateLeft() {
        return minimumChocolateLeft;
    }

    public void setMinimumChocolateLeft(int minimumChocolateLeft) {
        this.minimumChocolateLeft = minimumChocolateLeft;
    }

    //parameterized constructor for initialing private variables
    public ChocolateDistribution(int noOfChocolate, int noOfStudents) {
        this.noOfChocolate = noOfChocolate;
        this.noOfStudents = noOfStudents;
    }

    //function to find no. of minimum left chocolate
    public void findMinimumChocolateLeft() {
        double k;
        int ceiled_k;
        int floored_k;
        int sumWith_ceiled_k = 0;
        int sumWith_floored_k = 0;
        int minChocolateWith_floored_k = 0;
        int minChocolateWith_ceiled_k = 0;
        
        //this equation finds the value of k which is the 
        k = ((2 * this.noOfChocolate / this.noOfStudents) + 1 - this.noOfStudents) / 2.0;
        
        
        if (k < 1.0)  //if k is less than 1 then it is not possible to distribute among all students
        {
            setMinimumChocolateLeft(this.noOfChocolate);
        }
        else 
        {
            //get the ceiling value of k 
            ceiled_k = (int) Math.ceil(k);
            //get the floor value of k 
            floored_k = (int) Math.floor(k);

            //Get sum of consicutively distributed chocolate using both floor value and ceiling value of k
            for (int i = 0; i < 3; i++) 
            {
                sumWith_ceiled_k = sumWith_ceiled_k + ceiled_k + i;
                sumWith_floored_k = sumWith_floored_k + floored_k + i;
            }

            //finding out minimum no. of chocolate left using both floor value and ceiling value of k 
            minChocolateWith_ceiled_k = this.noOfChocolate - sumWith_ceiled_k;
            minChocolateWith_floored_k = this.noOfChocolate - sumWith_floored_k;

            /*
                if minimum number of chocolate left using floor or ceiling
                is negative then we will consider vise-a-versa.
            
                if given condition is wrong then we will find minimum
                value from minimum chocolate using floor value and
                            minimum chocolate using ceil value
                
            */
            if (minChocolateWith_ceiled_k < 0) {
                setMinimumChocolateLeft(minChocolateWith_floored_k);
            } else if (minChocolateWith_floored_k < 0) {
                setMinimumChocolateLeft(minChocolateWith_ceiled_k);
            } else {
                setMinimumChocolateLeft(Math.min(minChocolateWith_ceiled_k, minChocolateWith_floored_k));
            }
        }

        //print the final minimum no. of chocolate
        System.out.println("Minimum Number of Chocolate left : " + minimumChocolateLeft);

    }
}
