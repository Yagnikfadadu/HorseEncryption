package HorseEncryption;

import java.util.ArrayList;
import java.util.Arrays;

class PerformDecryption
{
    static ArrayList<String> Iteration(String s1)
    {
        String[] strings = s1.split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> processedList = new ArrayList<>();

        int half = (arrayList.size()/2);
        int dec=0;
        if(arrayList.size()%2==0)
        {
            for (int i=half;i<arrayList.size();i++,dec++)
            {
                processedList.add(arrayList.get(i));
                processedList.add(arrayList.get(dec));
            }
        }
        else
        {
            for (int i=half;i<arrayList.size();i++,dec++)
            {
                processedList.add(arrayList.get(i));
                processedList.add(arrayList.get(dec));
            }
            processedList.remove(arrayList.size());
        }

        return processedList;
    }
}

