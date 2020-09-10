package EqualsHashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainEqHash {
    public static void main(String[] args) {
        TestObject testObject = new TestObject("Test1",12);
        TestObject testObject1 = new TestObject("Test1",12);
        List<TestObject> list  = new ArrayList<>();
        list.add(testObject);
        list.add(testObject1);
        System.out.println(list.contains(new TestObject("Test1",12)));

        HashSet< TestObject > hash = new HashSet < TestObject > ();
        hash.add(testObject);
        hash.add(testObject1);
        //eger hashCode overriding edilmemisse equal yetmiyor
        System.out.println(hash.size());
        System.out.println(hash.contains(new TestObject("Test1",12)));
    }
}
