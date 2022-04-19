import java.util.ArrayList;

public class PerformDoubleDecryption {

    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    static ArrayList<String> Decrypt(String string){
        string = string.toLowerCase();
        int key = string.length() % 25 - 1;

        ArrayList<String> plainText = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals(" ") || String.valueOf(string.charAt(i)).equals(".") ||
                    String.valueOf(string.charAt(i)).equals(",") || String.valueOf(string.charAt(i)).equals("!") ||
                    String.valueOf(string.charAt(i)).equals("@") || String.valueOf(string.charAt(i)).equals("&") ||
                    String.valueOf(string.charAt(i)).equals("'") || String.valueOf(string.charAt(i)).equals("\""))
            {
                plainText.add(String.valueOf(string.charAt(i)));
            }
            else{
                int charPosition = LETTERS.indexOf(string.charAt(i));
                int keyVal = (charPosition - key) % 26;
                if (keyVal < 0) {
                    keyVal = LETTERS.length() + keyVal;
                }
                char replaceVal = LETTERS.charAt(keyVal);
                plainText.add(String.valueOf(replaceVal));
            }
        }
        return plainText;
    }
}
