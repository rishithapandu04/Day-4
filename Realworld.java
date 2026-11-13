import java.util.LinkedList;
import java.util.Scanner;
public class Realworld {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> songs = new LinkedList<>();
    songs.add("pokiri");
    songs.add("saiyaraa");
    songs.add("ishq");
    songs.add("jabili");
    songs.add("vaste");
    System.out.println("All songs:" + songs);
    songs.addFirst("kalavathi");
    songs.addLast("arya");
    
    System.out.println(" Enter song to remove");
    String name = sc.nextLine();
    songs.remove(name);
    System.out.println("First song:"+songs.getFirst());
    System.out.println("Last song:"+songs.getFirst());
    System.out.println("Upadte playlist:"+songs);
    System.out.println( "total songs:"+ songs.size());
}
}

    

