import java.util.ArrayList;
import java.util.Arrays;

public class PerformMorse
{
    static ArrayList<String> getMorse(String s1)
    {
        ArrayList<String> processedList = new ArrayList<>();
        char[] USS = new char[s1.length()];
        for (int i=0;i<s1.length();i++)
        {
            USS[i] = s1.charAt(i);
        }

        for (char uss : USS) {
            if (uss == 'a' || uss == 'A') {
                processedList.add("10");
            } else if (uss == 'b' || uss == 'B') {
                processedList.add("0111");
            } else if (uss == 'c' || uss == 'C') {
                processedList.add("0101");
            } else if (uss == 'd' || uss == 'D') {
                processedList.add("011");
            } else if (uss == 'e' || uss == 'E') {
                processedList.add("1");
            } else if (uss == 'f' || uss == 'F') {
                processedList.add("1101");
            } else if (uss == 'g' || uss == 'G') {
                processedList.add("001");
            } else if (uss == 'h' || uss == 'H') {
                processedList.add("1111");
            } else if (uss == 'i' || uss == 'I') {
                processedList.add("11");
            } else if (uss == 'j' || uss == 'J') {
                processedList.add("1000");
            } else if (uss == 'k' || uss == 'K') {
                processedList.add("010");
            } else if (uss == 'l' || uss == 'L') {
                processedList.add("1011");
            } else if (uss == 'm' || uss == 'M') {
                processedList.add("00");
            } else if (uss == 'n' || uss == 'N') {
                processedList.add("01");
            } else if (uss == 'o' || uss == 'O') {
                processedList.add("000");
            } else if (uss == 'p' || uss == 'P') {
                processedList.add("1001");
            } else if (uss == 'q' || uss == 'Q') {
                processedList.add("0010");
            } else if (uss == 'r' || uss == 'R') {
                processedList.add("101");
            } else if (uss == 's' || uss == 'S') {
                processedList.add("111");
            } else if (uss == 't' || uss == 'T') {
                processedList.add("0");
            } else if (uss == 'u' || uss == 'U') {
                processedList.add("110");
            } else if (uss == 'v' || uss == 'V') {
                processedList.add("1110");
            } else if (uss == 'w' || uss == 'W') {
                processedList.add("100");
            } else if (uss == 'x' || uss == 'X') {
                processedList.add("0110");
            } else if (uss == 'y' || uss == 'Y') {
                processedList.add("0100");
            } else if (uss == 'z' || uss == 'Z') {
                processedList.add("0011");
            }
            else
            {
                processedList.add(String.valueOf(uss));
            }
        }

        return processedList;
    }

    static ArrayList<String> getString(String s1)
    {
        String[] strings = s1.split("~");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> processedList = new ArrayList<>();
        String[] m1 = new String[arrayList.size()];
        for (int i=0;i<arrayList.size();i++)
        {
            m1[i] = arrayList.get(i);
        }
        String decode = "";
        for (String s:m1)
        {
            if (s.equals("10"))
            {
                processedList.add("a");
            }
            else if (s.equals("0111"))
            {
                processedList.add("b");
            }
            else if (s.equals("0101"))
            {
                processedList.add("c");
            }
            else if (s.equals("011"))
            {
                processedList.add("d");
            }
            else if (s.equals("1"))
            {
                processedList.add("e");
            }
            else if (s.equals("1101"))
            {
                processedList.add("f");
            }
            else if (s.equals("001"))
            {
                processedList.add("g");
            }
            else if (s.equals("1111"))
            {
                processedList.add("h");
            }
            else if (s.equals("11"))
            {
                processedList.add("i");
            }
            else if (s.equals("1000"))
            {
                processedList.add("j");
            }
            else if (s.equals("010"))
            {
                processedList.add("k");
            }
            else if (s.equals("1011"))
            {
                processedList.add("l");
            }
            else if (s.equals("00"))
            {
                processedList.add("m");
            }
            else if (s.equals("01"))
            {
                processedList.add("n");
            }
            else if (s.equals("000"))
            {
                processedList.add("o");
            }
            else if (s.equals("1001"))
            {
                processedList.add("p");
            }
            else if (s.equals("0010"))
            {
                processedList.add("q");
            }
            else if (s.equals("101"))
            {
                processedList.add("r");
            }
            else if (s.equals("111"))
            {
                processedList.add("s");
            }
            else if (s.equals("0"))
            {
                processedList.add("t");
            }
            else if (s.equals("110"))
            {
                processedList.add("u");
            }
            else if (s.equals("1110"))
            {
                processedList.add("v");
            }
            else if (s.equals("100"))
            {
                processedList.add("w");
            }
            else if (s.equals("0110"))
            {
                processedList.add("x");
            }
            else if (s.equals("0100"))
            {
                processedList.add("y");
            }
            else if (s.equals("0011"))
            {
                processedList.add("z");
            }
            else
            {
                processedList.add(s);
            }
        }
        return processedList;
    }
}