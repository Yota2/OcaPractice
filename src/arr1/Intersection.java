package arr1;

import java.util.Scanner;

public class Intersection {
    public static String FindIntersection(String[] strArr) {
        // Split the two comma-separated lists into arrays of integers
        String[] list1 = strArr[0].split(",");
        String[] list2 = strArr[1].split(",");
        int[] nums1 = new int[list1.length];
        int[] nums2 = new int[list2.length];
        for (int i = 0; i < list1.length; i++) {
            nums1[i] = Integer.parseInt(list1[i]);
        }
        for (int i = 0; i < list2.length; i++) {
            nums2[i] = Integer.parseInt(list2[i]);
        }
        // Find the intersection of the two arrays
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        // Convert the intersection list to a comma-separated string
        if (intersection.isEmpty()) {
            return "false";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int num : intersection) {
                sb.append(num).append(",");
            }
            sb.deleteCharAt(sb.length() - 1); // Remove the last comma
            return sb.toString();
        }
    }


}

// keep this function call here


}
