package SduPractice.PA.Reader;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ReaderFile {
    static ArrayList<String> sentenceList = new ArrayList<String>();
    static int count = 0;
    static int count1 = 0;

    public static void main(String[] args) throws Exception {
        AddText();
        String[] sentenceArray = sentenceList.toArray(new String[0]);
        for (int i = 0; i < sentenceArray.length; i++) {
            String find = "the";
            String Find = "The";
            boolean found = Arrays.asList(sentenceArray[i].split(" ")).contains(Find);
            if (found) {
                count++;
                System.out.println(sentenceArray[i] + " " + count);
                count = 0;

            }
            boolean found1 = Arrays.asList(sentenceArray[i].split(" ")).contains(find);
            if (found1) {
                count1++;
                System.out.println(sentenceArray[i] + " " + count1);
                count1 = 0;
            }
        }
    }
    public static void AddText() throws FileNotFoundException {
        Scanner sentence = new Scanner(new File("D:\\MyTest.txt"));
        while (sentence.hasNextLine()) {
            sentenceList.add(sentence.nextLine());
        }
        sentence.close();
    }
}