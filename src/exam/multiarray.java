package exam;


import java.util.Arrays;

public class multiarray {

    public static void main(String[] args) {

        int[][] nums = {{1,34,56,78,90},{83,87,26,4,72,6},{63,91,57,75}};
        int totalNum = 0;
        int totalSum = 0;

        for (int[] eachArr : nums) {
            double averge = 0;
            System.out.println(Arrays.toString(eachArr));
            for (int eachNum : eachArr) {
                averge += eachNum;
                totalSum+= eachNum;
            }
            System.out.println(eachArr.length);
            System.out.println("the averge of the array is :" + (averge/eachArr.length) );
            totalNum += eachArr.length;

        }
        System.out.println(totalNum);
        System.out.println(totalSum);
        System.out.println(totalSum/totalNum);

    }

}
