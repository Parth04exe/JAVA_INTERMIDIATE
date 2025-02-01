package ARRAY;
public class max_min_element_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 100, 5, 6, 300, 8, 9, 10};
        int max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min = arr[i];
            }
        System.out.println(max);
        System.out.println(min);        
       
    }
}
