package Ques2;

import javax.net.ssl.HandshakeCompletedListener;

public class OneBHK {
    private double roomArea;
    private double hallArea;
    double price;

    int counter = 0;

    OneBHK()
    {
        roomArea = 0;
        hallArea = 0;
        price = 0;

    }

    OneBHK(double roomArea, double hallArea, double price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;

    }

    void showOneBHK(){
        System.out.println("The room are is "+ this.roomArea + " Hall area is "+
                this.hallArea +" and the price is "+ this.price);
    }


    }

