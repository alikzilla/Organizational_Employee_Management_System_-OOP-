package SocialNetwork.TKcourses;

import java.util.ArrayList;

public class CompareList {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        System.out.println(Max(ar));
    }

    public static <T extends Comparable<T>> T Max(ArrayList<T> ar) {
        T max = ar.get(0);
        for (int i = 0; i < ar.size(); i++) {
            if(ar.get(i).compareTo(max) > 0){
                max = ar.get(i);
            }
        }
        return max;
    }
}