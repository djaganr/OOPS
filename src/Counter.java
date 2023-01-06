public class Counter {
    static int countStatic = 0;
    int count = 0;
    static String productSellRate = "good";

    static void shift(){
        productSellRate = "bad";
    }
    Counter(){
        count++;
        countStatic++;
        System.out.println("count= "+count+" ,countStatic= "+countStatic + " "+ productSellRate);
    }


}
