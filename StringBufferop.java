public class StringBufferop {

    public StringBufferop() {
    }

    public static void main(String[] var) {
        StringBuffer var1 = new StringBuffer("Java Programming");
        System.out.println("(i). The capacity of string buffer object is " + var1.capacity());
        String var2 = var1.reverse().toString();
        System.out.println("(ii). The reversed string is " + var2.toUpperCase());
        System.out.println("(iii). String after append: " + var1.append(" Language"));
    }
}
