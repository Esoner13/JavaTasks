public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 34;
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
        }
    }
    