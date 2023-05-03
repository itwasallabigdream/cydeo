package exam;

import Utilities.StringUtility;
public class Palindrome {

    public static void main(String[] args) {
        String[] palindrome = {"anna","java","racecar","level","youssra","soufiane"};
       int count = 0;

        for (int i = 0; i < palindrome.length-1 ; i++) {
           String reversePal = StringUtility.reverse(palindrome[i]);
            if (reversePal.equals(palindrome[i])){
                count++;
            }
        }
        System.out.println(count);

    }

    public static String reverse(String str){
        String reverse = "";  // to contain all the characters of the given string in reversed order

        for(int i = str.length() - 1 ; i >= 0; i-- ){ // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }

        return reverse;
    }
}
