package SocialNetwork.TKcourses;

public class CompareArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,3,32,43,6,4,80};
        System.out.println(max(numbers) );
    }
    public static <T extends Comparable<T>> T max(T[] ar){
        T max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if(ar[j].compareTo(max) > 0){
                    max = ar[j];
                }
            }
        }
        return max;
    }
}
