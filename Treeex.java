import java.util.TreeSet;

public class Treeex {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        names.add("John");
        System.out.println("TreeSet:" + names);
        names.remove("David");
        System.err.println("Contains Alice:"+ names.contains("Alice"));
        System.out.println("Size:" + names.size());
        System.err.println("Is Empty:" + names.isEmpty());
        }
}
