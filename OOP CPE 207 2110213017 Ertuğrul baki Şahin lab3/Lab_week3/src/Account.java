public class Account {
    private double balance;
    private String  ownerName;
    public Account(double balance,String ownerName) {
        this.balance =balance;
        this.ownerName=ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String  setOwnerName(String ownerName) {
        this.ownerName= ownerName;

        return this.ownerName;
    }
    public   double getBalance(){
        return balance;
    }

    public double withdraw(double amount) {
            if(balance > 0) {
                if (amount<balance) {
                    balance -= amount;
                    System.out.println("amount:" + amount);
                    return balance;
                }
                else {
                    System.out.println("amount can not be bigger than"+amount+" balance:"+balance);
                    return amount;
                }
            }
            else {
                System.out.println("You do not have money!!!");
            }
            return balance;
    }

    public double add(double amount) {

        balance+=amount;

        return  balance;
    }

}
