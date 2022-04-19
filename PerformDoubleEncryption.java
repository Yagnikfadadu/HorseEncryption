import java.util.ArrayList;

public class PerformDoubleEncryption {
    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    static ArrayList<String> Encrypt(String string){
        string = string.toLowerCase();
        int key = string.length() % 25 - 1;
        ArrayList<String> cipherText = new ArrayList<>();

        for (int i = 0; i < string.length(); i++)
        {
            if(String.valueOf(string.charAt(i)).equals(" ") || String.valueOf(string.charAt(i)).equals(".") ||
                    String.valueOf(string.charAt(i)).equals(",") || String.valueOf(string.charAt(i)).equals("!") ||
                    String.valueOf(string.charAt(i)).equals("@") || String.valueOf(string.charAt(i)).equals("&") ||
                    String.valueOf(string.charAt(i)).equals("'") || String.valueOf(string.charAt(i)).equals("\""))
            {
                cipherText.add(String.valueOf(string.charAt(i)));
            }
            else{
                int charPos = LETTERS.indexOf(string.charAt(i));
                int keyVal = (key + charPos) % 26;
                char replaceVal = LETTERS.charAt(keyVal);
                cipherText.add(String.valueOf(replaceVal));
            }
        }
        return cipherText;
    }
}
