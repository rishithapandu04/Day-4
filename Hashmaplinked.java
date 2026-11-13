import java.util.LinkedHashMap;

public class Hashmaplinked {
     public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Rishi");
        students.put(102, "Abhi");
        students.put(103, "Kari");
        students.put(104, "peter");
        System.out.println("HashMap" + students);
        System.err.println("student 101:" + students.get(101));
        students.put(102,"gnani");
        System.out.println("Contains key 101:" + students.containsKey(101));
        System.out.println("contains value Rishi:" + students.containsValue("Rishi"));
        System.out.println("Size:" + students.size());
    }
}
