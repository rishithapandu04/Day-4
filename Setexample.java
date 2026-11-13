import java.util.HashSet;

public class Setexample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Alice");
        names.add("david");
        names.add("Robert");
        names.add("john");
        System.out.println("HashSet:" + names);
        names.remove("David");
        System.out.println("Contains Alice:" + names.contains("Alice"));
        System.out.println("Size:" + names.size());
        System.err.println("Is Empty:" + names.isEmpty());
    }
}
