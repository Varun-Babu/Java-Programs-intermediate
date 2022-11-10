package Ques2;

public class DriverClass {
    public static void main(String[] args){
        TwoBHK t1 = new TwoBHK(1,2,3000,4);
        TwoBHK t2 = new TwoBHK(10,20,30000,40);
        TwoBHK t3 = new TwoBHK(100,200,300000,400);
        double totalCost = t1.price+t2.price+t3.price;
        t1.showTwoBHK();
        t2.showTwoBHK();
        t3.showTwoBHK();

        System.out.println("Total amount is " + totalCost);


    }
}
