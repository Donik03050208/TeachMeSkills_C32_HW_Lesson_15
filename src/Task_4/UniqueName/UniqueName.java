package Task_4.UniqueName;

import java.util.HashSet;
import java.util.Set;

public class UniqueName {
    public static class UniqueNames {

        private  Set<String> names;

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

