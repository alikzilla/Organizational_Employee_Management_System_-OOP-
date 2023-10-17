package SduPractice;

import java.util.*;

public class leetcode1 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        for(int i = 1; i < alt.length; i++){
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        for (int i = 0; i < alt.length; i++) {
            System.out.print(alt[i] + " ");
        }
        int max = alt[0];
        for(int i = 1; i < alt.length; i++){
            if(alt[i] > alt[i - 1]){
                max = alt[i];
            }
        }
        System.out.println(max);
    }
}