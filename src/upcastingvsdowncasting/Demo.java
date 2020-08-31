package upcastingvsdowncasting;

class Parent {
    String name; 

    void method() 
    { 
        System.out.println("Method from Parent"); 
    } 
} 
  
// Child class 
class Child extends Parent { 
    int id; 

    @Override
    void method() 
    { 
        System.out.println("Method from Child"); 
    } 
} 
  

public class Demo {
  
    public static void main(String[] args)
    { 
        // Upcasting 
        Parent p = new Child(); 
        p.name = "Java upcast and downcast testing";
  
        // This parameter is not accessible 
        // p.id = 1; 
        System.out.println(p.name); 
        p.method(); 
  
        // Trying to Downcasting Implicitly 
        // Child c = new Parent(); - > compile time error 
  
        // Downcasting Explicitly 
        Child c = (Child)p; 
  
        c.id = 1; 
        System.out.println(c.name); 
        System.out.println(c.id); 
        c.method(); 
    } 
} 