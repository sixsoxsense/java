package second_week;

import java.awt.*;
import java.util.Arrays;

public class method_practice {
    public static void main(String[] args) {
        System.out.println(maxNum(7, 3, 5));
    }

    public static int maxNum(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static int[] makeArray(int n) {
        int[] int_array=new int[n];
        for (int i = 0; i<n;i++){
            int_array[i]=++i;
        }
        return int_array;
    }
}
