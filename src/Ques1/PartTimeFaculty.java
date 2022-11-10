package Ques1;

public class PartTimeFaculty extends Faculty {
    int hour;
    double rate;

    PartTimeFaculty(int facultyId, int time, double rate){
        this.setFacultyId(facultyId);
        this.hour = time;
        this.rate = rate;
        this.salary = this.hour * this.rate;
    }

    void facultyData(){
        System.out.println("Temporary Faculty Details");
        System.out.println("ID = " +this.getFacultyId() + "\n Salary = " + this.salary);
        System.out.println();
    }
}
