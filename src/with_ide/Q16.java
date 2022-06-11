package with_ide;

import with_ide.SingleEx;

class A {
    public static final A instance = new A(); //Eager initialization

    private A(){

    }


    public A getInstance() {
        return instance;
    }
}

public class Q16 {
    public static void main(String[] args) {
        SingleEx obj = new SingleEx();
        SingleEx obj1 = new SingleEx();
        System.out.println(obj);
        System.out.println(obj1);
    }

}
