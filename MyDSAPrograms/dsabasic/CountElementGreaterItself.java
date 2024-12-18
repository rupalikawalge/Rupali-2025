package dsabasic;

public class CountElementGreaterItself {
    public static int countElementGreaterItself(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int maxCount = 0;
        for (int num : arr) {
            if (num == max)
                maxCount++;
        }

        return n - maxCount;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1};

        System.out.println(countElementGreaterItself(arr));
    }
}
