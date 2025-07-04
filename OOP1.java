public class OOP1 {
    public static void main(String[] args){
        Student[] students = new  Student[5];
        Student random = new Student();
        System.out.println(random.name);
        Student one = new Student();
        Student two = one;
        one.name = "XYZ";
        System.out.println(two.name);
        two.name = "ad";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}
class Student{
    int rno;
    String name;
    float marks = 78.9f;
    Student(){
        // this is how call a constructor from another constructor
        // internally: new Student(1111, "DF", 100.0f);
        this(1111, "DF", 100.0f);
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
              }

}
