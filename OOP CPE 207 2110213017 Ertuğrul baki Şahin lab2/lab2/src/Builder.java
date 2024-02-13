public class Builder {
     private    String Name;
     private   int Id;
     public int PerhourWages;
     public int WorkHour;

     public Builder(String Name,int Id){
            this.Name =Name;
            this.Id=Id;
     }

    public int calculateSalary() {
        int salary = PerhourWages * WorkHour;
        return salary;
    }
}


