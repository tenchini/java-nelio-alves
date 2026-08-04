package modulo10.aula103;

public class Program {
    public static void main(String[] args) {

        int x = 20;

        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);

        //Com wrapper class
        int num = 30;
        Integer obj2 = num;
        System.out.println(obj2);

        int num2 = obj2 * 2;
        System.out.println(num2);
    }
}
