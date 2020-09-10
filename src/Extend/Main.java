package Extend;

public class Main {
    public static void main(String[] args) {
        Class1 c1 = new Class2();
        c1.base();
    }
}
class Class1{
    public void base(){
        System.out.println("class1 method called.");
    }
}
class Class2 extends  Class1{
    /**
     * override cagrilmadigi icin Class2 nin metodu baz alinir.
     */
    public void base(){
        System.out.println("class2 method called.");
    }
}