import java.util.Arrays;
import java.util.ListIterator;
import java.util.ArrayList;

public class ReplaseSomeWords {
    public static String readAndReplace(String kbInput) {
        String stringOut;

        ArrayList<String> words = new ArrayList<String>(Arrays.asList(kbInput.split("\\s")));
        private ArrayList<String> replase (ArrayList < String > words) {
            ListIterator<String> iterator = words.listIterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                if (next.equals("бяка")) {
                    iterator.set("Вырезано цензурой");
                }
            }
            for (String subStr : words) {
                stringOut = subStr + "/t";
                return stringOut;
            }
        }
    }
}


