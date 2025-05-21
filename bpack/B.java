package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println(proVar);
        System.out.println(pubVar);
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Call the display method
    }
}





