package Ques1;

public class DriverClass {
    public static void main(String[] args){
        FullTimeFaculty f1 = new FullTimeFaculty(1,20000,600);
        FullTimeFaculty f2 = new FullTimeFaculty(2,15000,60);
        f1.facultyData();
        f2.facultyData();
        PartTimeFaculty p1 = new PartTimeFaculty(1,20000,600);
        PartTimeFaculty p2 = new PartTimeFaculty(2,15000,60);
        p1.facultyData();
        p2.facultyData();
    }
}
