package SocialNetwork.TKcourses;

public class CompareFind {
    public static void main(String[] args) {
        Integer[] ar = {1,2,3,4,5,3,3};
        System.out.println(linearSearch(ar, 4));
    }
    public static <T extends Comparable<T>> int linearSearch(T[] ar , T key){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i].compareTo(key) == 0){
                return i;
            }
        }
        return -1;
    }
}
