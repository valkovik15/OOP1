import java.util.Comparator;
import java.util.Objects;

public class Subject implements Comparable<Subject> {
    private String name;
    private int time;

    public int getTime() {
        return time;
    }
String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Subject subject) {
        Float f=new Float(Math.signum(time-subject.getTime()));

        if(f.intValue()==0)
        {
            int x=name.compareTo(subject.getName());
            return x;
        }
        else
            return -f.intValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return time == subject.time &&
                Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        int prime = 47;
        int result = 73;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        Integer x=new Integer(time);
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        return result;

    }

    @Override
    public String toString() {
        StringBuilder temp=new StringBuilder();
        temp.append(name);
        temp.append(" ");
        temp.append(time);
        return temp.toString();
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {
        name="Непонятный";
        time=1;
    }

    public Subject(String name, int time) {
        this.name = name;
        this.time = time;
    }
}
