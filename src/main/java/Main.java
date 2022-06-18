import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1=Person.builder().emer("kyle").mosha(25).build();
        System.out.println(p1);
        System.out.println();

        Student  s2= new Student();
        s2.shto(4);
        s2.shto(4);
        s2.shto(4);
        System.out.println(s2.notat);
    }
}
