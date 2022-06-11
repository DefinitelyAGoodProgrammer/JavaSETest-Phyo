package with_ide;

abstract class Name{
    abstract void teachers();
}

class CS extends Name{
    void teachers(){
        System.out.println("We are teachers");
    }
}

public class Q28 {
    public static void main(String[] args) {
        Name obj = new CS();
        obj.teachers();
    }
}
