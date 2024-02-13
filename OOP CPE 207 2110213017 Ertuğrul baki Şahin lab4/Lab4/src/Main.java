public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        try {
            worker.setSalary(-1500);
            worker.setName("Ali");
                System.out.println("you can amount money");

        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}