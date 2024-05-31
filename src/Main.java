import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "cherry", "kot", "apple", "cherry"};
        List<String> uniqueStrings = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String s : array) {
            if (!set.contains(s)) {
                uniqueStrings.add(s);
                set.add(s);
            }
        }
        System.out.println(uniqueStrings.stream().reduce((s1, s2) -> s1 + " " + s2).get());
    }

}