package cucumber_exemple;

public class VowelsCounter {
    private static final char[] VOWELS = new char[]{'a','e','i','o','u'};
    public static int count(String text){
        int result = 0;
        for(int i = 0; i < text.length();i++){
            for (char vowels : VOWELS) {
                if (text.charAt(i) == vowels) {
                    result++;
                }
            }
        }
        return result;
    }
}
