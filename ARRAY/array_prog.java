package ARRAY;
public class array_prog {
    public static void main(String[] args) {
        int arr[]=new int[10];//array declaration
        //int[] arr1=new int[10];
        //int []arr2=new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i]=i;
        }
        for(int a:arr){
            System.out.println(a);
        }
        int arr2[]={1,2,3,4,5,6,7,8,9,10};
        for(int b:arr2){
            System.out.println(b);
        }
        //LENGTH
        System.out.println(arr.length);
    }
}