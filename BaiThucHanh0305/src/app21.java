import java.util.ArrayList;

public class app21 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("orange");
        color.add("green");
        color.remove("green");
        color.add("pink");
        color.add("yellow");

        System.out.println(color.get(1));
        System.out.println(color.contains("orange"));
        System.out.println(color.size());
        System.out.println(color);
    }
}