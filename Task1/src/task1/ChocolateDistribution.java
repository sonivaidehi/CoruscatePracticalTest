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
        
    }
}
