
public class MainClass {
    public static void main(String[] args) {
        String name = "pr1.hrn";
        Input input = new Input();
        input.readData(name);

        var kruskal = new Kruskal(input);
        kruskal.zostrojKostru();
        kruskal.vypisKostru();

    }
}
