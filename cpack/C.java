package cpack;
import apack.A;

public class C {
    public void display(){
        A obj= new A();
        System.out.println(obj.pubVar);
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.display(); // Call the display method
    }

}
