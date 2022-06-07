import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int value = 33 ;
//        Integer b = 33 ;
        Integer [] value = {3, 4} ;
//        changeValue(value);
//        System.out.println("value = " + value);
//        changeValue(b);
//        System.out.println("b = " + b);
        changeValue(value);
        String cStr = Arrays.toString(value) ;
        System.out.println("c = " + cStr);
    }
    public static void changeValue (int value) {
        value = 22 ;
    }
    public static void changeValue (Integer value) {
        value = 22 ;
    }

    public static void changeValue (Integer [] value) {
//        value[0] = 1 ;
//        value[1] = 2 ;
        value = new Integer[]{1,2};
//        value []= {3,4} ;
        String valueStr = Arrays.toString(value) ;
        System.out.println("value = " + valueStr);
    }

}