import java.util.*;
class Table{
    void print(){
        System.out.println("Number    Square    Cube");
        for(int i = 0;i<=10;i++){
            System.out.println(i + "           " + i*i + "        " + i*i*i);
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String []args){
        Table table = new Table();
        table.print();
    }
}
