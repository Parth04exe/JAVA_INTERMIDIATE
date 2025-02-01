package ARRAY;
public class reverse_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 100, 5, 6, 300, 8, 9, 10};

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
