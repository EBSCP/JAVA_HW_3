public class Worker {
        private double Salary;
        private String Name;
        static int id=1;
    public double getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public  String setName(String Name) {
        this.Name = Name;
        return Name;
    }

    public int ID(int id){
        id++;
        return id;
    }
    public void setSalary(double Salary) throws IllegalArgumentException {
        if (Salary < 0 && id<3) {
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        }
        this.Salary = Salary;
    }
}
