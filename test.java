import java.util.ArrayList;
import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text :");
        String userInput = sc.nextLine();
        String encryptedText="";
        ArrayList<String> l1 = PerformEncryption.Iteration(userInput);
        for (String s: l1)
        {
            encryptedText += s;
        }
        System.out.println(encryptedText);

        ArrayList<String> l2 = PerformDecryption.Iteration(encryptedText);
        String decryptedText="";
        for (String s: l2)
        {
            decryptedText += s;
        }
        System.out.println(decryptedText);
    }
}
