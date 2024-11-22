import java.util.*;
public class Model {
    private int x, y, z; 

    public Model() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Model(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void inputCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x-coordinate: ");
        this.x = scanner.nextInt();
        System.out.print("Enter y-coordinate: ");
        this.y = scanner.nextInt();
        System.out.print("Enter z-coordinate: ");
        this.z = scanner.nextInt();
    }

    public void displayCoordinates() {
        System.out.println("3D Point: (" + x + ", " + y + ", " + z + ")");
    }

    public double computeDistance(Model other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) +
                         Math.pow(this.y - other.y, 2) +
                         Math.pow(this.z - other.z, 2));
    }

    public static void main(String[] args) {
        Model origin = new Model();
        System.out.println("Origin:");
        origin.displayCoordinates();

        Model arbitraryPoint = new Model(3, 4, 5);
        System.out.println("Arbitrary Point:");
        arbitraryPoint.displayCoordinates();

        Model userPoint = new Model();
        System.out.println("Input coordinates for a new point:");
        userPoint.inputCoordinates();
        userPoint.displayCoordinates();

        double distance = arbitraryPoint.computeDistance(userPoint);
        System.out.println("Distance between Arbitrary Point and User Point: " + distance);
    }
}
