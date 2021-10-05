package Lesson3.Homework;

public class Task3 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5};
        int[] nums2 = {5, 6, 4,6, 7, 8, 9};
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        System.out.print("int[] nums1 = {");
        for (int element : nums1) {
            System.out.print(element + ",");
        }
        System.out.println("}");
        System.out.print("int[] nums2 = {");
        for (int element : nums2) {
            System.out.print(element + ",");
        }
        System.out.println("}");
        System.out.print("int[] nums3 = {");
        for (int k = 0; k < nums3.length; k++) {
            if (i <= j && i < nums1.length || j == nums2.length) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
        }
        for (int element : nums3) {
            System.out.print(element + ",");
        }
        System.out.println("}");
    }
}

