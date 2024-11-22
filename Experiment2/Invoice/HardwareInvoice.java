import java.util.*;
class Invoice{
    String partDescription;
    String partNumber;
    int quantity;
    double pricePerItem;

    Invoice(int quantity,double pricePerItem, String partDescription, String partNumber){
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        if(pricePerItem<0){
            this.pricePerItem = 0;
        } else{
            this.pricePerItem = pricePerItem;
        }
        this.quantity = quantity;
    }

    //setters
    void setQuantity(int qty){
        this.quantity =qty;
    }
    void setPricePerItem(double perItem){
        this.pricePerItem = perItem;
    }
    void setDescription(String description){
        this.partDescription = description;
    }
    void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    //getters
    int getQuantity(){
        return this.quantity;
    }
    double getPricePerItem(){
        return this.pricePerItem;
    }
    String getPartDescription(){
        return this.partDescription;
    }
    String getPartNumber(){
        return this.partNumber;
    }
    double getInvoiceAmount(){
        return this.pricePerItem*this.quantity;
    }
}
public class HardwareInvoice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the part description: ");
        String partDesc = sc.nextLine();
        System.out.print("Enter the part number: ");
        String partNum = sc.nextLine();
        System.out.print("Enter the Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price per item: ");
        double perItem = sc.nextDouble();
        
        Invoice invoice = new Invoice(quantity, perItem, partDesc, partNum);
        System.out.println();
        System.out.println(".............INVOICE...........");
        System.out.println("Part Description:    " + invoice.getPartDescription());
        System.out.println("Part Number:         " + invoice.getPartNumber());
        System.out.println("Quantity:            " + invoice.getQuantity());
        System.out.println("Price per item:      " + invoice.getPricePerItem());
        System.out.println("Amount:              " + invoice.getInvoiceAmount());
    }
}