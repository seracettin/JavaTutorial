package HashmapHashcode;

public final class PersonBuilder {
    public String name;
    public String surname;
    public int age;

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setAge(age);
        return person;
    }
}
