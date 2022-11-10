package Ques4;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args){
        Random r1 = new Random();
        int choice = r1.nextInt(4);
        switch(choice){
            case 1:
                Medicine O1 = new Ointment();
                Medicine O2 = new Ointment();
                Medicine O3 = new Ointment();
                O1.displayLabel();
                break;
            case 2:
                Medicine S1 = new Syrup();
                Medicine S2 = new Syrup();
                Medicine S3 = new Syrup();
                S1.displayLabel();
                break;
            case 3:
                Medicine T1 = new Tablet();
                Medicine T2 = new Tablet();
                Medicine T3 = new Tablet();
                T1.displayLabel();
                break;
            default:
                System.out.println("invalid");
        }
    }
}
