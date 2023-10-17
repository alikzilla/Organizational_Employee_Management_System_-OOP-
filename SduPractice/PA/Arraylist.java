package SduPractice.PA;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2L);
        list.add(3.00);
        list.add(4.56F);
        System.out.println(sum(list));
    }
    public static double sum(List<? extends Number> arraylist){
        double res = 0;
        for(Number n : arraylist){
            res += n.doubleValue();
        }
        return res;
    }
}
