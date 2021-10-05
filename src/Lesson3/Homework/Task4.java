package Lesson3.Homework;

public class Task4 {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 5, 6}, {4, 5, 6}};
        int[] nums1 = getOneDimArray(nums);
        for (int element : nums1) {
            System.out.print(element);
        }
    }

    public static int[] getOneDimArray(int[][] arrayToProcess) {
        int elementcount = 0;
        for (int i = 0; i < arrayToProcess.length; i++) {
            elementcount += arrayToProcess[i].length;
        }
        int[] oneDimArray = new int[elementcount];
        int k = 0;
        for (int i = 0; i < arrayToProcess.length; i++) {
            for (int j = 0; j < arrayToProcess[i].length; j++) {
                oneDimArray[k] = arrayToProcess[i][j];
                k++;
            }
        }
        return oneDimArray;
    }
}
