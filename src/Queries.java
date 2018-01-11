import java.util.ArrayList;

public class Queries {
    public String query;

    public Queries(ArrayList list) {
        String[] splitted;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().indexOf("?") >= 0 && i < list.size()) {
                splitted = list.get(i).toString().split("\\?");
                query = splitted[1];
                //System.out.println(query);
                //System.out.println("Debug 0");
            } else if (list.get(i).toString().indexOf("?") == -1 && i + 1 >= list.size()) {
                System.out.println("Error");
            }
        }
        System.out.println("Yes");
    }
}
