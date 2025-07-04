public class OOP2 {
    public static void main(String[] args){
        A obj = new A("GB");
        System.out.println(obj);

    }
}
class A{
    final int num = 34;
    String name;
    A(String name){
        this.name = name;
    }
}
