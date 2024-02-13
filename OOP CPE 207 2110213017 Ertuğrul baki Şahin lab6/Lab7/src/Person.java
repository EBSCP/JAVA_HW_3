public class Person {
   public String firstName;
    public String LastName;

    public int Id;
    public int age;

    public String getFirstName( String Name) {
        this.firstName = Name;
        return firstName;
    }

    public String getLastName(String Lastname) {
        this.LastName= Lastname;
        return LastName;
    }
    public Person(String Name,String LastName,int id,int age) {
        this.LastName = getLastName(LastName);
        this.firstName = getFirstName(Name);
        this.Id = counter();
        this.age= counter();
    }

    public Person(String Name,String LastName) {
        this.LastName = LastName;
        this.firstName = Name;


    }
    public Person(int id) {
        this.LastName = "";
        this.firstName = "";
        this.Id=id;
    }
    public Person() {
        this.LastName = "";
        this.firstName = "";
        this.Id=0;
        this.age=0;

    }

    public int counter() {
        int Counter; Counter=0;Counter++; return Counter;
    }
}
