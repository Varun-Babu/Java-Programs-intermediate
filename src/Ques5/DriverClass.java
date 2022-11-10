package Ques5;

public class DriverClass {
    public static void main(String[] args){
        Tile t1 = new Tile(5);
        Floor f1 = new Floor(50,25);
        double tileNeed = f1.totalTiles(t1);
        System.out.println(tileNeed);
    }
}
