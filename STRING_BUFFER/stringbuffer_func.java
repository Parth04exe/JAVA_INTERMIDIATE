// package STRING_BUFFER;

public class stringbuffer_func {
    public static void main(String[] args) {
        //APPEND
        StringBuffer s1=new StringBuffer("parth");
        s1.append("sarathy");//concat not possible in string buffer
        System.out.println(s1);
        
        //INSERT
        s1.insert(2,"parth");
        System.out.println(s1);
        s1.insert(2,'c');
        System.out.println(s1);
        s1.insert(2,123);
        System.out.println(s1);
        s1.insert(2, 1.2);
        System.out.println(s1);
        s1.insert(2, 1.2f);
        System.out.println(s1);
        s1.insert(2, 123456789123456L);
        System.out.println(s1);

        //reverse
        StringBuffer s2=new StringBuffer("parth");
        s2.reverse();
        System.out.println(s2);

        //replace
        StringBuffer s3=new StringBuffer("partha sarathy");
        s3.replace(5, 10, "smriti");//10-1my name
        System.out.println(s3);
        StringBuffer s6=new StringBuffer("partha sarathy");
        s6.replace(5, 9, "smriti samikshya");//9-1my name
        System.out.println(s6);

        //capacity
        StringBuffer s4=new StringBuffer("partha");
        System.out.println(s4.capacity());
        StringBuffer s5=new StringBuffer();
        System.out.println(s5.capacity());
    }
}
