package EqualsHashCode;

import java.util.Objects;

public class TestObject {
    String name;
    int id;

    public TestObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }
}
