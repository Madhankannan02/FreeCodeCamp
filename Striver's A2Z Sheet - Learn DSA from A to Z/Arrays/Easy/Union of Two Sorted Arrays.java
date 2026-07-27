import java.util.*;

class Main {

    static void addIfUnique(List<Integer> ar, int n) {
        if (ar.isEmpty() || ar.get(ar.size() - 1) != n) {
            ar.add(n);
        }
    }

    public static int[] unionArray(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;

        int i = 0, j = 0;
        List<Integer> arr = new ArrayList<>();

        while (i < n && j < m) {
            if (num1[i] == num2[j]) {
                addIfUnique(arr, num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                addIfUnique(arr, num1[i]);
                i++;
            } else {
                addIfUnique(arr, num2[j]);
                j++;
            }
        }

        while (i < n) {
            addIfUnique(arr, num1[i]);
            i++;
        }

        while (j < m) {
            addIfUnique(arr, num2[j]);
            j++;
        }

        int[] primitiveArray = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            primitiveArray[k] = arr.get(k);
        }

        return primitiveArray;
    }

    public static void main(String[] args) {
        int[] ar = {3, 4, 6, 7, 9, 9};
        int[] ar2 = {1, 5, 7, 8, 8};

        System.out.println(Arrays.toString(unionArray(ar, ar2)));
    }
}