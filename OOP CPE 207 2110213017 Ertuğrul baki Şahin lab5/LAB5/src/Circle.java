public class Circle {

   private double PI = 3.1459;

   private double Radius;

   public  double getRadius (){
       return Radius;
   }

   public double CalculateArea(double Radius) {
      double Area;
      Area = Radius*Radius*PI;
      return  Area;
   }
}
