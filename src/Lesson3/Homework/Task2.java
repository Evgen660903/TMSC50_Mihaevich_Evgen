package Lesson3.Homework;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 4, 3, 4, 7, 8, 9, 8, 3, 4, 2, 4, 7};
        System.out.print("int[] nums = {");
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                nums[j] = nums[i] == nums[j] ? 0 : nums[j];
            }
        }
        for (int element : nums) {
            System.out.print(element + ",");
        }
        System.out.println("}");
    }
}

