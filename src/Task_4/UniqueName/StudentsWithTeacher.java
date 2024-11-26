package Task_4.UniqueName;

import java.util.HashSet;
import java.util.Set;

public class StudentsWithTeacher {

    public static class UniqueNames {

        private Set<String> names;

        public UniqueNames() {
            names = new HashSet<>();
        }

        public void addName(String name) {
            names.add(name);
        }

        public Set<String> getNames() {
            return names;
        }
    }

}
