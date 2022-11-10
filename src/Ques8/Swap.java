package Ques8;

public class Swap {
    int num1;
    int num2;
    Swap(int a,int b){
        num1=a;
        num2=b;
    }
    public void callByReference(Swap ob){
        int temp=ob.num1;
        ob.num1= ob.num2;
        ob.num2=temp;
    }
    void callByValue(int a,int b){
        this.num1=b;
        this.num2=a;
    }
}
class Swapping{
    public static void main(String[] args) {
        Swap s1=new Swap(1,2);
        System.out.println("Before swapping \n num1 :"+s1.num1+" \nnum2 :"+s1.num2);
        System.out.println("\nswap by value");
        s1.callByValue(1,2);
        System.out.println("num1 :"+s1.num1+ "\nnum2 :"+s1.num2);
        System.out.println("\nSwap by reference");
        System.out.println("Before swapping  num1 :"+s1.num1+"  num2 :"+s1.num2);
        System.out.println("  ");
        s1.callByReference(s1);
        System.out.println("num1 :"+s1.num1+ "\nnum2 :"+s1.num2);
//        s1.callByReference(s1);
//        System.out.println("num1 :"+s1.num1+ "\nnum2 :"+s1.num2);

    }
}


