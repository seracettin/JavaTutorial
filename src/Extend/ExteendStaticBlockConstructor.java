package Extend;

public class ExteendStaticBlockConstructor {
    public static void main(String[] args) {
        new Student();
        //P2S1P1P3S2S3
    }
}
class Person{
    {
        System.out.println("P1");
    }
    static {
        System.out.println("P2");
    }
    public Person() {
        System.out.println("P3");
    }
}
class Student extends Person{
    static {
        System.out.println("S1");
    }
    {
        System.out.println("S2");
    }
    public Student() {
        System.out.println("S3");
    }
}