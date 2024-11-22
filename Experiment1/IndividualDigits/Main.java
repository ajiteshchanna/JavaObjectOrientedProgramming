import java.util.*;
class Individual{
    int number;
    Individual(int number){
        this.number = number;
    }
    void print(){
        String str = Integer.toString(number);
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i) + "    ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a 5 digit number: ");
        int x = sc.nextInt();
        Individual num = new Individual(x);
        num.print();
    }
}
