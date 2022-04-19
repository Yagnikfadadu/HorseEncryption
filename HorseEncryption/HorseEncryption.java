package HorseEncryption;

import java.util.ArrayList;

public class HorseEncryption
{
    public String encrypt(String userInput)
    {
        String encryption1= "";
        ArrayList<String> iteration1 = PerformEncryption.Iteration(userInput);
        for (String s: iteration1)
        {
            encryption1 += s;
        }

        ArrayList<String> iteration2 = PerformDoubleEncryption.Encrypt(encryption1);
        String encryption2="";
        for (String s: iteration2)
        {
            encryption2 += s;
        }

        String encryption3 = "";
        ArrayList<String> iteration3 = PerformMorse.getMorse(encryption2);
        for (String s: iteration3)
        {
            encryption3 +=s+"~";
        }
        return encryption3;
    }

    public String decrypt(String s1)
    {
        String decryption1 = "";
        ArrayList<String> iteration4 = PerformMorse.getString(s1);
        for (String s: iteration4)
        {
            decryption1 +=s;
        }

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
        return decryption3;
    }

}