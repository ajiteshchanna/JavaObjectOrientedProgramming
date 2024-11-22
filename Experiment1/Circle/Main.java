import java.util.Scanner;
class Circle{
    int r;
    Circle(int radius){
        r = radius;
    }

    int getDiameter(){
        return 2*this.r;
    }
    double getCircumference(){
        return 2*Math.PI*this.r;
    }
    double getArea(){
        return Math.PI*this.r*r;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        Circle circle = new Circle(r);
        System.out.println("Enter choice:\n1 -> Diameter\n2 -> Circumference\n3 -> Area");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Diameter: " + circle.getDiameter());
                break;
            case 2:
                System.out.println("Circumference: " + circle.getCircumference());
                break;
            case 3:
                System.out.println("Area: " + circle.getArea());
            default:
                break;
        }
    }
}