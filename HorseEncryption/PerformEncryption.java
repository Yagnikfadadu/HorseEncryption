package HorseEncryption;

import java.util.ArrayList;
import java.util.Arrays;

class PerformEncryption
{

    static ArrayList<String> Iteration(String s1)
    {
        String[] strings = s1.split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> processedList = new ArrayList<>();

            for (int i=1;i<arrayList.size();i+=2)
            {
                processedList.add(arrayList.get(i));
            }

            for (int i=0;i<arrayList.size();i+=2)
            {
                processedList.add(arrayList.get(i));
            }


        return processedList;
    }
}

