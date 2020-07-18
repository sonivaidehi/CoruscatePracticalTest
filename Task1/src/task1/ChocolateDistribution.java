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

    private int noOfChocolate;
    private int noOfStudents;

    private int minimumChocolateLeft;

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

    public ChocolateDistribution(int noOfChocolate, int noOfStudents) {
        this.noOfChocolate = noOfChocolate;
        this.noOfStudents = noOfStudents;
    }

    public void findMinimumChocolateLeft() {
        double k;
        int ceiled_k;
        int floored_k;
        int sumWith_ceiled_k = 0;
        int sumWith_floored_k = 0;
        int minChocolateWith_floored_k = 0;
        int minChocolateWith_ceiled_k = 0;
        k = ((2 * this.noOfChocolate / this.noOfStudents) + 1 - this.noOfStudents) / 2.0;
        
        System.out.println("k" + k);
        
    }
}
