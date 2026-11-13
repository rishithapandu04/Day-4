import java.util.TreeSet;
public class Marks {
public static void main(String[] args) {
    TreeSet<Integer> marks = new TreeSet<>();
    marks.add(75);
    marks.add(90);
    marks.add(65);
    marks.add(85);
    marks.add(75);
    marks.add(80);
    System.out.println("Marks:" + marks);
    System.out.println("lowest mark:"+ marks.first());
    System.out.println("Highest mark:" + marks.last());
    marks.remove(65);
    System.out.println("after removing 65:"+ marks);
    System.out.println("90 Exists:" + marks.contains(90));
    System.out.println("Unique marks" + marks.size());
}

    
}
