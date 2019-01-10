import java.util.Arrays;
import java.util.ListIterator;
import java.util.ArrayList;

public class ReplaceSomeWords {

    public static String readAndReplace(String kbInput) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(kbInput.split("\\s")));
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("бяка")) {
                iterator.set("вырезано цензурой");
            } else if (next.equals("Бяка")) {
                iterator.set("Вырезано цензурой");
            }
        }
        return String.join(" ", words);
    }
}


