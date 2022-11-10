package Ques2;

public class TwoBHK extends OneBHK {
    private double room2Area;


    TwoBHK(){
        System.out.println("TwoBHK");

    }

    TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;

    }

    void showTwoBHK() {
        super.showOneBHK();
        System.out.println("Room 2 Area = " + this.room2Area);
    }

}
