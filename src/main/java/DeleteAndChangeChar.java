import java.util.*;

public class DeleteAndChangeChar {
    public static void main(String[] args) {
        String keyInput = "Как cука";
        ArrayList<String> sentence = new ArrayList<String>(Arrays.asList(keyInput.split("\\s")));
        ListIterator<String> iterator = sentence.listIterator();
        int i = 0;
        for (Iterator<String> iteratot = sentence.iterator(); iteratot.hasNext(); i++) {
            if (i % 2 == 0) {
                String words = iteratot.next();
                StringBuffer stringReverse = new StringBuffer(words);
                System.out.print(stringReverse.reverse().toString());
            } else if (i % 2 == 1) {
                String termDel = iteratot.next();
                StringBuffer stringDel = new StringBuffer(termDel);
                for (int j = stringDel.length() - 1; j >= 0; j--) {
                    if (j % 2 == 1) {
                        String delChar = stringDel.deleteCharAt(j).toString();
                    }
                }
                System.out.print((" "+ stringDel.toString()));
            }
        }

    }
}





