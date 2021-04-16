package Extend;

public class ExteendStaticBlockConstructor {
    public static void main(String[] args) {
        new Student();
        //P2S1P1P3S2S3
    }
}

class Person {
    {
        System.out.print("P1");
    }

    static {
        System.out.print("P2");
    }

    public Person() {
        System.out.print("P3");
    }
}

class Student extends Person {
    static {
        System.out.print("S1");
    }

    {
        System.out.print("S2");
    }

    public Student() {
        System.out.print("S3");
    }
}