package ARRAY;
// public class linear_search {

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 6, 10};
//         int k=116,i;
        
//         for (i = 0; i < arr.length; i++) {
            
//             if(arr[i]==k){
//                 System.out.println("element found at index "+ (i+1));
//                 break;//if you wan to print multiple places then remove break
//             }
//         }
        
//         if (i==arr.length) {
//             System.out.println("element not found");
//         }
//     }
// }
public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 6, 10};
        int k = 6;
        boolean flag = false;
        int index =0; // To store the index of the found element //index = -1

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                flag = true;
                index = i; // Store the index where the element is found
                break; // Stop the loop once found
            }
        }

        if (flag) {
            System.out.println("Element found at location " + (index+1));
        } else {
            System.out.println("Element not found.");
        }
    }
}

