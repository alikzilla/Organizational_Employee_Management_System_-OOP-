package SduPractice.PA.PA11;

import java.util.*;
import java.util.Scanner;

public class PR11B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(countCharacter(input));
    }
    static HashMap<Character, Integer> countCharacter(String input){
        char[] arr = input.toCharArray();
        HashMap<Character, Integer> res = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            res.put(arr[i], res.getOrDefault(arr[i], 0) + 1);
        }
        return res;
    }
}
