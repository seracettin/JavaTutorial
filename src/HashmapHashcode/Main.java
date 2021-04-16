package HashmapHashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Person person =  PersonBuilder.aPerson()
                .withAge(20)
                .withName("seracettin")
                .withSurname("yasar")
                .build();
        Person person1 =  PersonBuilder.aPerson()
                .withAge(20)
                .withName("seracettin")
                .withSurname("yasar")
                .build();
        Person person2 =  PersonBuilder.aPerson()
                .withAge(21)
                .withName("seracettin")
                .withSurname("yasar")
                .build();
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        Map<Person,Integer> map = new HashMap<>();
        map.put(person,person.hashCode());
        map.put(person1,person1.hashCode());
        map.put(person2,person2.hashCode());
        System.out.println("------------------map---------------");
        map.forEach((personObj, integer) -> {
            System.out.println(personObj.toString());
        });
    }

}

