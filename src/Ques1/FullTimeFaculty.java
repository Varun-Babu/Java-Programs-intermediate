package Ques1;

public class FullTimeFaculty extends Faculty {
    private double basic;
    private double allowance;

    FullTimeFaculty(int facultyId, double basic, double allowance){
        this.setFacultyId(facultyId);
        this.basic = basic;
        this.allowance = allowance;
        this.salary = this.basic + this.allowance;
    }

    void facultyData(){
        System.out.println("Faculty Details");
        System.out.println("ID = " +this.getFacultyId() + "\n Salary = " + this.salary);
        System.out.println();

    }
}
