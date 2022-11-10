package Ques5;

public class Floor {
    int floorLength;
    int floorBreadth;

    Floor(int floorLength,int floorBreadth){
        this.floorBreadth = floorBreadth;
        this.floorLength = floorLength;
    }
    double totalTiles(Tile t1)
    {
        double floorArea  = floorBreadth * floorLength;
        double tileCount = floorArea / t1.getArea();
        return tileCount;
    }
}
