package Lab10;

class CircleAndSphere {
 private static final double PI = 3.14159; 
 private double radius; 

 public CircleAndSphere(double radius) {
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public double calculateCircumference() {
     return 2 * PI * radius;
 }

 public double calculateCircleArea() {
     return PI * radius * radius;
 }

 public double calculateSphereVolume() {
     return (4.0 / 3.0) * PI * radius * radius * radius;
 }

 public double calculateSphereSurfaceArea() {
     return 4 * PI * radius * radius;
 }
}

public class Lab10t2 {
 public static void main(String[] args) {
     CircleAndSphere shape = new CircleAndSphere(5.0);
     System.out.println("Circumference of Circle: " + shape.calculateCircumference());
     System.out.println("Area of Circle: " + shape.calculateCircleArea());
     System.out.println("Volume of Sphere: " + shape.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + shape.calculateSphereSurfaceArea());

     shape.setRadius(7.0);
     System.out.println("After radius update:");
     System.out.println("Circumference of Circle: " + shape.calculateCircumference());
     System.out.println("Area of Circle: " + shape.calculateCircleArea());
     System.out.println("Volume of Sphere: " + shape.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + shape.calculateSphereSurfaceArea());
 }
}
