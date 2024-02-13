public class Account {
    private  double balance;
    private String OwnerName;


    public double getBalance() {
        return balance;
    }
    public String getownerName () {
        return OwnerName;
    }
    public void setOwnerName() {
        this.OwnerName= OwnerName;
    }

    public Account( double balance,String OwnerName) {
        this.OwnerName= OwnerName;

        if(balance> 0.0){
            this.balance = balance;
        }

    }

    public double Add(double Amount) {
      if (Amount>0.0) {
          balance += Amount;
      }
        return balance;
    }
    public  double  withdraw(double Amount) {
        if(balance>0.0 && Amount>0.0) {
            balance-=Amount;
        }
        return balance;
    }
}

