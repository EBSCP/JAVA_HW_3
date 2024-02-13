public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle_1 = new Circle();
        Circle circle_2 = new Circle();

        double[] radii = {5, 10, 15};

        for (double radius : radii) {
            System.out.println("Area for circle with radius " + radius + ": " + circle.CalculateArea(radius));

        }
    }
}