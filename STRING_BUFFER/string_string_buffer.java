// package STRING_BUFFER;

public class string_string_buffer {
    public static void main(String[] args) {
        String s1="parth";
        s1.concat("sarathy");
        System.out.println(s1);

        String s2=s1.concat("sarathy");
        //String s3=s1.concat('s');
        System.out.println(s2);
        System.out.println(s3);

        StringBuffer s3=new StringBuffer("parth");
        s3.append("sarathy");//concat not possible in string buffer
        System.out.println(s3);
    }
}