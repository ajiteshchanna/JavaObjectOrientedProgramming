import java.util.Scanner;

class IntegerL{
    int x;
    int y;

    IntegerL(int x,int y){
        this.x = x;
        this.y = y;
    }
    void isLarger(){
        if(this.x>this.y){
            System.out.println(this.x + " is larger!");
        } else if(this.y>this.x){
            System.out.println(this.y + " is larger!");
        } else{
            System.out.println("Both are equal!");
        }
    }
}
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        IntegerL l = new IntegerL(x,y);
        l.isLarger();
    }
}
