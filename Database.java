import java.util.HashMap;

public class Database {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101,"Alia");
        students.put(102,"ashuu");
        students.put(103,"Nani");
        students.put(104, "abhi");
        System.out.println("student records:" + students);
        System.out.println("student 102:"+ students.get(102));
        students.put(103,"kiran");
        students.remove(105);
        System.out.println("iD 101 exists:" + students.containsValue("Alia"));
        System.out.println("Alia exists:"+ students.containsKey("Alia"));
        System.out.println("student ID'S:" + students.keySet());
        System.err.println("student ID'S:" + students.values());

    }
}
