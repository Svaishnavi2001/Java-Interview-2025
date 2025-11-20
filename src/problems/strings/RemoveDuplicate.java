package problems.strings;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicate {
    public static void main(String[] args) {

        RemoveDuplicate rd = new RemoveDuplicate();
        System.out.println(rd.findDuplicates("Necessary"));
    }

    public Set<Character> findDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.add(c)){

            }
            else {
                duplicates.add(c);
            }
        }
        return duplicates;
    }
}
