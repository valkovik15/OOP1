import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Subject> container = new ArrayList<>();
        container.add(new Subject("Программирование", 3));
        container.add(new Subject("ВКИАД", 1));
        Collections.sort(container);
        System.out.println(Arrays.toString(container.toArray()));
        container.sort(new AlphabetComparator());
        System.out.println(Arrays.toString(container.toArray()));

    }
}
