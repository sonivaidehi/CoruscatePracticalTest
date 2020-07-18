/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Vaidehi
 */
public class TrainCompartment {
    private final int totalNoOfRows = 18;
    private int passengerSeatNumber;
    private int seatNumberFacingPassenger;
    private String seatType;

    public TrainCompartment(int passengerSeatNumber) {
        this.passengerSeatNumber = passengerSeatNumber;
    }

    

    private void findRowOfSeat(int row,int columnNo) {
        
        int addOrSubtractableValue = getDifferenceBetweenSeats(columnNo, row);
        
        if (row % 2 != 0) {//for odd rows
            //if row is odd adding this value will give facing seat no.
            seatNumberFacingPassenger = passengerSeatNumber + addOrSubtractableValue;
        } else {// for even rows
            //if row is even substracting this value will give facing seat no.
            seatNumberFacingPassenger = passengerSeatNumber - addOrSubtractableValue;
        }
       
    }

    private int getDifferenceBetweenSeats(int columnNo, int row) {
        //different condition for odd and even row because direction of counting is alternative
        if (row % 2 != 0) {
            return 13 - (2 * columnNo);
        }else{
             return 13 - (2 * (7-columnNo));
        }
    }
    
    public  void findTypeOfSeat(int columnNo){
        //find the seat-type according to column number
        switch(columnNo){
            case 1:
            case 6:
                seatType = "WS";
                break;
            case 2:
            case 5:
                seatType = "MS";
                break;
            case 3:
            case 4:
                seatType = "AS";
                break;                
        }
    }

    public void calculateFacingSeatNoAndSeatType() {
        int i;
        //go through all seats available in train compartment
        for (i = 0; i < totalNoOfRows; i++) {
            if (passengerSeatNumber >= 6 * i + 1 && passengerSeatNumber <= 6 * i + 6) {
                int rowStart = 6 * i + 1, rowEnd = 6 * i + 6;
                int j,columnNo=0;
                for (j = rowStart; j <= rowEnd; j++) {
                    //tranversing in row in which passanger seat is
                    columnNo++;
                    if (passengerSeatNumber == j) {
                        int row = i + 1;                        
                        findRowOfSeat(row, columnNo);
                        findTypeOfSeat(columnNo);
                        System.out.println(seatNumberFacingPassenger + " " + seatType);
                    }
                }
            }
        }
    }
}