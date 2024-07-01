public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java ";
        String str3 = "hello, world";

        // 1. String substring()
        String substringValue = str1.substring(7);
        System.out.println("str1.substring(7) : " + substringValue);

        // 2. String toUpperCase()
        String toUpperCaseValue = str2.toUpperCase();
        System.out.println("str2.toUpperCase() : " + toUpperCaseValue);

        // 3. String toLowerCase()
        String toLowerCaseValue = str3.toLowerCase();
        System.out.println("str3.toLowerCase() : " + toLowerCaseValue);

        // 4. String trim()
        String trimValue = str1.trim();
        System.out.println("str1.trim() : " + trimValue);

        // 5. String replace()
        String replaceValue = str1.replace("World", "Java");
        System.out.println("str1.replace(\"World\", \"Java\") : " + replaceValue);

        // 6. String replaceAll()
        String replaceAllValue = str3.replaceAll("hello", "Goodbye");
        System.out.println("str3.replaceAll(\"hello\", \"Goodbye\") : " + replaceAllValue);

        // 7. String length()
        int lengthValue = str1.length();
        System.out.println("str1.length() : " + lengthValue);

        // 8. String charAt()
        char charAtValue = str1.charAt(0);
        System.out.println("str1.charAt(0) : " + charAtValue);

        // 9. String equals()
        boolean equalsValue = str1.equals(str3);
        System.out.println("str1.equals(str3) : " + equalsValue);

        // 10. String equalsIgnoreCase()
        boolean equalsIgnoreCaseValue = str1.equalsIgnoreCase(str3);
        System.out.println("str1.equalsIgnoreCase(\"hello, world\") : " + equalsIgnoreCaseValue);
    }
}