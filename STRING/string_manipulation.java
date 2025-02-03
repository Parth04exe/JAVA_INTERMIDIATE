public class string_manipulation {
    public static void main(String[] args) {
        String s1="parth";
        System.out.println(s1.length());
        String s2="sarathy";
        String s3=s1+s2;
        System.out.println(s3);

        String s4="parth sarathy";
        int len=s4.length();
        System.out.println(len);

        String s5="parth";
        String s6="sarathy";
        String s7=s5+s6;
        System.out.println(s7);

        String s8="parth";
        char arr[]=s8.toCharArray();// it will return character array 
        System.out.println(arr);
        System.out.println("to character array "+ arr);
        //System.out.println("to character array "+ Arrays.toString(arr));
        System.out.println(s8.hashCode());

        //charat
        String s9="ashutosh";
        System.out.println(s9.charAt(5));

    }
    
}
