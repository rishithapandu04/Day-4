import java.util.LinkedList;
public class Example {
    public static  void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("john");
        names.add("Alice");
        names.add("david");
        names.add("Ravid");
        System.out.println("LinkList:" + names);
        System.out.println("First Element:" +names.get(0));
        names.set(1,"Peter");
        names.remove("David");
        names.addFirst("Sam");
        names.addLast("tom");
        System.out.println("Size:" + names.size());
    }
}
