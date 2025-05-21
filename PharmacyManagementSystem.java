package pharm;

import java.util.ArrayList;

class Pharmacy{
    int id;
    int quantity;
    double price;
    String name;
    public Pharmacy(int id,String name,int quantity,double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


}
public class PharmacyManagementSystem {
    private ArrayList<Pharmacy> inven=new ArrayList<>();
    public void addItem(Pharmacy item){
        inven.add(item);
    }
    public void update(int id,int quantity,double price){
        for (Pharmacy item: inven){
            if(item.id==id){
                item.quantity=quantity;
                item.price=price;
                break;

            }
        }
    }
    public void removeItem(int id){
        inven.removeIf(item -> item.id==id);
    }
    public Pharmacy search(int id){
        for (Pharmacy item: inven){
            if(item.id==id){
                System.out.println("found");
                return item;
            }
        }
        System.out.println("not found");
        return null;
    }
    public void displayInventory(){
        for(Pharmacy item: inven){
            System.out.println(item.id+"\t");
        }
    }
    public static void main(String[] args){
        PharmacyManagementSystem ims= new PharmacyManagementSystem();
        ims.addItem(new Pharmacy(1,"Crocin",5,23.5));
    }



}
