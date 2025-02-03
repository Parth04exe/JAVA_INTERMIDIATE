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

        //COMPARE TO //returns integer
        String s10="hello";
        String s11="kemcho";
        System.out.println(s10.compareTo(s11));

        int res=s10.compareTo(s11);
        System.out.println(res);

        //reference com equals()
        System.out.println(s10.equals(s11));

        //COMPARE TO //returns integer

        String s12="hello";
        String s13="hello";
        System.out.println(s12.compareTo(s13));

        int res1=s12.compareTo(s13);
        System.out.println(res1);

        //reference com equals()
        System.out.println(s12.equals(s13));

        //CONTAINS
        String s14="hello i am parth welcome to my coding world";
        System.out.println(s14.contains("parth we"));
        System.out.println(s14.contains("parth "));
        System.out.println(s14.contains("parth"));
        System.out.println(s14.contains("visal"));

        //INDEX OF
        String s15="Ashutosh hello";
        System.out.println(s15.indexOf('h'));
        System.out.println(s15.indexOf("hello"));
        //System.out.println(s15.index);


        //REPLACE
        String s16="hello Ashuetosh";
        System.out.println(s16.replace("e", "a"));
        String s17="hello Ashuetosh";
        System.out.println(s17.replace('e', 'a'));
        String s18="hello Ashuetosh";
        System.out.println(s18.replace("hello", "hi"));

        //SBSTRING
        String s19="hello i am part welcome to my coding world";
        System.out.println(s19.substring(0,9));//0 to 9-1
        System.out.println(s19.substring(4,9));
        System.out.println(s19.substring(4));
    }
    
}
