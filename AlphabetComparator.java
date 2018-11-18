import java.util.Comparator;

public class AlphabetComparator implements Comparator<Subject> {
    @Override
    public int compare(Subject subject, Subject t1) {
        return subject.getName().compareTo(t1.getName());
    }
}
