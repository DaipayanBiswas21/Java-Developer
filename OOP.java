import java.util.Arrays;

public class OOP {
    public static void main(String[] args){
    // data of 5 students {rollno, name, marks} - (properties)
    Student[] students = new  Student[5];
    Student Dbxd = new Student();
    Student Dbxd1 = new Student(13, "DB", 67.8f);
    Student rahul = new Student();
    Student random = new Student(Dbxd1);
    System.out.println(random.name);
    System.out.println(rahul.name);
  //  Dbxd.rno = 114;
  //  Dbxd.name = "DB";
   // Dbxd.marks = 98.9f;
    System.out.println(Dbxd1.rno); 
    System.out.println(Dbxd1.name);
    System.out.println(Dbxd1.marks);
    System.out.println(Dbxd.rno);
    System.out.println(Dbxd.name);
    System.out.println(Dbxd.marks);
    Dbxd.changeName("IPL");
    Dbxd.greeting();
    }  
}
// create a class
// for every single student

// we need one word to access every object
class Student{
    int rno;
    String name;
    float marks = 78.9f;
    void greeting(){
        System.out.println("hello! " + name);
        System.out.println("hello! " + this.name);
    }
    // void changeName(String newName){
    //     name = newName;
    // }
    void changeName(String name){
        this.name = name;
    }
    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object
     Student(){
        this.rno = 114;
        this.name = "Dbxdcr7";
        this.marks = 88.5f;
     }
    // The below will also work for sure
    //  Student(int rno1, String name1, float marks1){
    //      rno = rno1;
    //      name = name1;
    //      marks = marks1;
    //  }
    // Student arpit = new Student(17, "AP", 65.9f);
    //here, this will be replaced with arpit
 Student(int rno, String name, float marks){
 this.rno = rno;
 this.name = name;
 this.marks = marks;
       }
       Student(Student other){
         this.rno = other.rno;
         this.name = other.name;
         this.marks = other.marks;
       }
 }
