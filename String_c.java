class String_c{
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("The string is "+str);
        System.out.println("The length of string is "+str.length());
        System.out.println("Character at 2nd and 4th position is "+str.charAt(1)+" and "+str.charAt(3));
        System.out.println("The substring using start index is "+str.substring(5));
        System.out.println("The substring using start and end index is "+str.substring(0,4));
    }
}