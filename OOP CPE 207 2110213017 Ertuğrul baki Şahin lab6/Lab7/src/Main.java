import javax.naming.Name;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) {

        Person P1 = new Person("Ali","Veli",0,0);
        Person P2 = new Person("Ayşe","çelik");
        Person P3 = new Person(3);
        Person P4 = new Person();

        System.out.println(P1.age+"and "+P1.Id+" "+P1.LastName+" is"+P1.firstName);
        System.out.println(P2.age+"And"+ P2.Id+""+P2.LastName+"is"+P2.firstName);
        System.out.println(P3.age+"and "+P3.Id+" "+P3.LastName+" is"+P3.firstName);
        System.out.println(P4.age+"and "+P4.Id+" "+P4.LastName+" is"+P4.firstName);

    }
}