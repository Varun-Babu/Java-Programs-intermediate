package Ques3;

public class DriverClass {
    public static void main(String[] args){
        MathFunction mf1 = new MathFunction();
        System.out.println(mf1.multiply(5,2));
        System.out.println(mf1.multiply(5f,2.2f));
        System.out.println(mf1.multiply(5.3f,2));
    }
}
