import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1= new Account(1250,"Ali");
        Account account2= new Account(1450,"Mehmet");

        Scanner scanner= new Scanner(System.in);
        int thePassword = scanner.nextInt();
        int operation;


        if ( thePassword == 1234) {
            operation = scanner.nextInt();
            switch (operation){
                case 1:
                    account1.add(1250);
                    account2.add(1100);
                    System.out.println("balance:"+account1.getBalance());
                    System.out.println("balance:"+account2.getBalance());
                    break;

                case 2:
                    account1.withdraw(1115);
                    account2.withdraw(1500);
                    System.out.println("balance:"+account1.getBalance());
                    System.out.println("balance:"+account2.getBalance());
                    break;
                default:
                    System.out.println("please enter a number between 1-2");
                    break;
            }

        }
        else {
            thePassword = scanner.nextInt();
                if (thePassword == 1234) {
                    operation = scanner.nextInt();
                    switch (operation){
                        case 1:
                            account1.add(1250);
                            account2.add(1100);
                            System.out.println("balance:"+account1.getBalance());
                            System.out.println("balance:"+account2.getBalance());
                            break;
                        case 2:
                            account1.withdraw(1115);
                            account2.withdraw(1500);
                            System.out.println("balance:"+account1.getBalance());
                            System.out.println("balance:"+account2.getBalance());
                            break;
                        default:
                            System.out.println("please enter a number between 1-2");
                            break;
                    }
             }
                else {
                    System.out.println("you blocked");
                }
        }
    }
}