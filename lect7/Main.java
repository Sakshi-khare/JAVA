// instance methods vs static methods
public class Main {
    void Sum(int a) {
        System.out.println("hello");
    }
    static int val(){
        return 0;
    }
    public static void main(String[] args){
        Main obj=new Main();
        int data =9;
        obj.Sum(data); // instance call
        val();        // static call
    }
}
