class Department{
    private String dept;
    Department(String dept){
        this.dept = dept;
    }

    void getDept(){
        System.out.println("Department: "+dept);
    }
}

class Student{
    private String name;
    private int id;
    private Department dept;
    Student(String name, int id, Department dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    void getStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        dept.getDept();
    }
}

class Aggregation{
    public static void main(String[] args){
        Department d = new Department("CSE");
        Student std = new Student("Rocky", 111, d);
        std.getStudentDetails();
    }
}