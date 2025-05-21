package apack;

public class A {
    int defaultVar=1;
    protected int proVar=2;
    private int priVar=3;
    public int pubVar=4;
    public void display(){

        System.out.println(defaultVar);
        System.out.println(priVar);

    }
    public static void main(String[] args){
        A obj= new A();
                obj.display();
    }
}
