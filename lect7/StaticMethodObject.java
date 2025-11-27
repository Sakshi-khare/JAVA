//static method creating object inside
public class StaticMethodObject {
    String name = "hello";

    static void Sum() {
        StaticMethodObject a = new StaticMethodObject(); // object created inside static method
        System.out.println("Accessing non-static variable inside static method: " + a.name);
    }
}

class StaticMethodDemo {
    public static void main(String[] args) {
        StaticMethodObject.Sum(); // static method call
    }
}


