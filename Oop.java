import java.util.*;
class College {
    static int code=100;
    int Collegecode;
    String collegename;
    int noofdept;
    College(String colname,int dept)
    {
        Collegecode=code++;
        this.collegename=colname;
        this.noofdept=dept;
    }
    void display()
    {
        System.out.println("Collegecode : "+Collegecode);
        System.out.println("CollegeName : "+collegename);
        System.out.println("Noofdept : "+noofdept);
    }
}
class Student extends College
{

    String Studentname;
    int regno;
    Student(String name,int no,String collegenam,int noofdept)
    {
        super(collegenam,noofdept);
        this.Studentname=name;
        this.regno=no;
    }
    void display()
    {
        super.display();
        // System.out.println("Student Name : "+Studentname);
        // System.out.println("Register number : "+regno);
    }
}
public class Oop{
    public static void main (String args[])
    {
        College hicet = new Student("Hicet",45,"hicet",123);
        // College hit=new College("Hit",30);
        // Student std=new Student("Rakkesh",146,"Hicet",50);
        hicet.display();
        // // hit.displayCollege();
        // std.display();
    }
}
