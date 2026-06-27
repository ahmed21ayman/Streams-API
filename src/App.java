import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList<>();
        names.add("omar");
        names.add("mahmoud");
        names.add("mohamed");
        names.add("ali");
        names.add("mansour");
        System.out.println("maping");
        names.stream().map(name -> name.toUpperCase());
        names.stream().map(name -> name.toLowerCase());
        System.out.println("------------------------");
        System.out.println("filter");
        names.stream().filter(name -> name.startsWith("a"));
        System.out.println("------------------------");
        System.out.println("sorted");
        names.stream().sorted();
        System.out.println("------------------------");
        System.out.println("for each");
        names.stream().forEach(name -> System.out.println(name));
        System.out.println("------------------------");
        System.out.println("Combining Operations");
        names.stream().filter(name -> name.startsWith("m")).map(name -> name.toUpperCase()).sorted().forEach(name -> System.out.println(name));
    }
}
