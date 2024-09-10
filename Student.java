package Lab6;

public class Student {
    String name;
    int age;
    String department;
    Student(){
        this.name = "unknown";
        this.age = 20;
       this. department = "Unassigned";
       System.out.println("Default constructor");
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("department:"+department);

    }
    Student(int age , String name){
        this.age = age;
       this. name = name;
        department = "IT";
        System.out.println("Two parameter Constructor");
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("department:"+department);
    }
    Student(String name , int age,String department){
        this.name = name;
       this. age = age;
        this.department = department;
        System.out.println("Three Parameter constructor");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department : "+department);

    }
}
class main{
    public static void main(String[]args){
        Student st1 = new Student();
        Student st2 = new Student(20,"riya");
        Student st3 = new Student("Rohan",22,"CRM");

    }
}
