package day20_array_each;

import java.util.Arrays;
import java.util.Scanner;
import Utilities.StringUtility;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};

        String[] strs2 = {"abc", "hello", "java"};

        System.out.println(longestPalindrome(strs));
        System.out.println(longestPalindrome(strs2));

        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to add");
        String[] inputWords = new String[input.nextInt()];
        input.nextLine();

        for(int i = 0; i < inputWords.length; i++){
            System.out.println("Enter word " + (i + 1));
            inputWords[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(inputWords));
        System.out.println(Arrays.toString(T3ReverseEach.reverseEach(inputWords)));
        System.out.println(longestPalindrome(inputWords));


    }

    public static String longestPalindrome(String [] words){

        String longest = "";

        for(String each : words){

            String reverse = StringUtility.reverse(each);

            if(reverse.equals(each) && reverse.length() > longest.length()){
                longest = each;
            }
        }

        return longest.isEmpty() ? "No Palindrome Found": longest;
    }
}