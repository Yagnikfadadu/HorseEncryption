import java.util.ArrayList;
import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text :");
        String userInput = sc.nextLine();
        String encryption1= "";
        ArrayList<String> iteration1 = PerformEncryption.Iteration(userInput);
        for (String s: iteration1)
        {
            encryption1 += s;
        }
        System.out.println(encryption1);

        ArrayList<String> iteration2 = PerformDoubleEncryption.Encrypt(encryption1);
        String encryption2="";
        for (String s: iteration2)
        {
            encryption2 += s;
        }
        System.out.println(encryption2);

        String encryption3 = "";
        ArrayList<String> iteration3 = PerformMorse.getMorse(encryption2);
        for (String s: iteration3)
        {
            encryption3 +=s;
        }

        String decryption1 = "";
        ArrayList<String> iteration4 = PerformMorse.getString(iteration3);
        for (String s: iteration3)
        {
            decryption1 +=s;
        }
        System.out.println(iteration4);

        String decryption2 = "";
        ArrayList<String> iteration5 = PerformDoubleDecryption.Decrypt(decryption1);
        for (String s:iteration5)
        {
            decryption2 +=s;
        }

        String decryption3 = "";
        ArrayList<String> iteration6 = PerformDecryption.Iteration(decryption2);
        for (String s:iteration6)
        {
            decryption3 +=s;
        }
        System.out.println(decryption2);
    }
}
