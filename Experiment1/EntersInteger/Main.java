import java.util.*;
class TwoInteger{
    int x;
    int y;

    TwoInteger(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    int getSum(){
        return this.x + this.y;
    }
    int getDifference(){
        if(this.x>this.y){
            return this.x-this.y;
        } else{
            return this.y-this.x;
        }
    }
    int getProduct(){
        return this.x*this.y;
    }
    int getQuotient(){
        if(this.x>this.y){
            return this.x/this.y;
        } else{
            return this.y/this.x;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        
        TwoInteger t = new TwoInteger(x, y);
        System.out.println("Difference: " + t.getDifference());
        System.out.println("Product: " + t.getProduct());
        System.out.println("Sum: "+t.getSum());
        System.out.println("Quotient: " + t.getQuotient());
    }
}
