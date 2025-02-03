//package STRING;

public class string_exp {
    public static void main(String[] args) {
        String s1="parth";
        System.out.println(s1);
        String s2="sarathy";
        System.out.println(s2);
        System.out.println(s1==s2);
        String s3="parth";
        System.out.println(s1==s3);//JVM ne jo object s1 ko banake dia tha wohi object s3 ko banake dia
        System.out.println(s1.hashCode());//returns encode value its not memory address 
        //kahan pe store hai wohi hai ea
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        //USING NEW OPERATOR 
        String s4="hello";
        String s5=new String("hello");
        System.out.println(s1==s2);

        //USING CHARACTER ARRAY
        char ch[]={'p','a','r','t','h'};
        for(char a:ch){
            System.out.println(a);
        }
        char ch1[]={'p','a','r','t','h'};
        String s6=new String(ch1);
        System.out.println(s6);
    }    
}
