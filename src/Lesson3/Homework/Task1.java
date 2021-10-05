package Lesson3.Homework;

public class Task1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int tempVar = nums[nums.length - 1];
        System.out.print("{");
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = tempVar;
        for (int element : nums
        ) {
            System.out.print(element + ",");
        }
        System.out.println("}");
    }
}

