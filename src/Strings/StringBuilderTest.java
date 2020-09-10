package Strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("p");
        StringBuilder sb2 = new StringBuilder("q");
        test(sb,sb2);
        System.out.println(sb + ", " +sb2);
        //sonuc: pr, qs
    }
    public static  void test(StringBuilder s1, StringBuilder s2){
        s1.append("r");
        s2.append("s");
        s1=s2;
    }

}
