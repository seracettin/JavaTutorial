package Statics.b;
import static Statics.a.A.*;
import  static java.lang.System.out;
public class B {
    public static void main(String[] args) {
        int c=10;
        out.println(INC);
        out.println(inc(c));
        out.println(inc(c));
    }
}
