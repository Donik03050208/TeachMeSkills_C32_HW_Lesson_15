package Task_4.UniqueName;

import java.util.HashSet;
import java.util.Set;



public class StudentName {
    private Set<String> names;


    public StudentName() {
        names = new HashSet<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public Set<String> getNames() {
        return names;
    }
}




