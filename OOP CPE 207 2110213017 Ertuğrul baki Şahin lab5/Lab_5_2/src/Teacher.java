public class Teacher {
    private int id;
    private Branch branch;

    // Constructor
    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }

}
