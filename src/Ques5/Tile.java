package Ques5;

public class Tile {
    private int edgeLength;

    Tile(int edgeLength){
        this.edgeLength =edgeLength;
    }
    int getArea(){
        int tileArea = this.edgeLength * this.edgeLength;
        return tileArea;
    }
}
