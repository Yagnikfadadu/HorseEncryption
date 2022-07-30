package HorseEncryption;

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
                processedList.add("<>");
            } else if (uss == 'b' || uss == 'B') {
                processedList.add("><<<");
            } else if (uss == 'c' || uss == 'C') {
                processedList.add("><><");
            } else if (uss == 'd' || uss == 'D') {
                processedList.add("><<");
            } else if (uss == 'e' || uss == 'E') {
                processedList.add("<");
            } else if (uss == 'f' || uss == 'F') {
                processedList.add("<<><");
            } else if (uss == 'g' || uss == 'G') {
                processedList.add(">><");
            } else if (uss == 'h' || uss == 'H') {
                processedList.add("<<<<");
            } else if (uss == 'i' || uss == 'I') {
                processedList.add("<<");
            } else if (uss == 'j' || uss == 'J') {
                processedList.add("<>>>");
            } else if (uss == 'k' || uss == 'K') {
                processedList.add("><>");
            } else if (uss == 'l' || uss == 'L') {
                processedList.add("<><<");
            } else if (uss == 'm' || uss == 'M') {
                processedList.add(">>");
            } else if (uss == 'n' || uss == 'N') {
                processedList.add("><");
            } else if (uss == 'o' || uss == 'O') {
                processedList.add(">>>");
            } else if (uss == 'p' || uss == 'P') {
                processedList.add("<>><");
            } else if (uss == 'q' || uss == 'Q') {
                processedList.add(">><>");
            } else if (uss == 'r' || uss == 'R') {
                processedList.add("<><");
            } else if (uss == 's' || uss == 'S') {
                processedList.add("<<<");
            } else if (uss == 't' || uss == 'T') {
                processedList.add(">");
            } else if (uss == 'u' || uss == 'U') {
                processedList.add("<<>");
            } else if (uss == 'v' || uss == 'V') {
                processedList.add("<<<>");
            } else if (uss == 'w' || uss == 'W') {
                processedList.add("<>>");
            } else if (uss == 'x' || uss == 'X') {
                processedList.add("><<>");
            } else if (uss == 'y' || uss == 'Y') {
                processedList.add("><>>");
            } else if (uss == 'z' || uss == 'Z') {
                processedList.add(">><<");
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

        for (String s:m1)
        {
            switch (s) {
                case "<>" -> processedList.add("a");
                case "><<<" -> processedList.add("b");
                case "><><" -> processedList.add("c");
                case "><<" -> processedList.add("d");
                case "<" -> processedList.add("e");
                case "<<><" -> processedList.add("f");
                case ">><" -> processedList.add("g");
                case "<<<<" -> processedList.add("h");
                case "<<" -> processedList.add("i");
                case "<>>>" -> processedList.add("j");
                case "><>" -> processedList.add("k");
                case "<><<" -> processedList.add("l");
                case ">>" -> processedList.add("m");
                case "><" -> processedList.add("n");
                case ">>>" -> processedList.add("o");
                case "<>><" -> processedList.add("p");
                case ">><>" -> processedList.add("q");
                case "<><" -> processedList.add("r");
                case "<<<" -> processedList.add("s");
                case ">" -> processedList.add("t");
                case "<<>" -> processedList.add("u");
                case "<<<>" -> processedList.add("v");
                case "<>>" -> processedList.add("w");
                case "><<>" -> processedList.add("x");
                case "><>>" -> processedList.add("y");
                case ">><<" -> processedList.add("z");
                default -> processedList.add(s);
            }
        }
        return processedList;
    }
}