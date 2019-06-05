import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public double getArea() {
        return width*height;
    }
    public  double getPerimeter() {
        return (width+height)*2;
    }
    public String display() {
        return "Rectangle{" + "width="+width+", height="+height+"}";
    }
}
class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width:");
        double width=sc.nextDouble();
        System.out.println("Enter the height");
        double height=sc.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter of the rectangle is "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle is "+rectangle.getArea());
    }
}
