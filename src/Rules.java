import java.util.ArrayList;

public class Rules {

    public Rules(ArrayList list){
        for(int i = 0; i < list.size(); i++){
            char[] array = list.get(i).toString().toCharArray();
            for (char character : array){
                if (character == '=' && array[0] == '='){
                    System.out.println("L: " + i);
                    list.remove(i);
                    list.remove(i - 10);
                }
                if (character == '#' && array[0] == '#'){
                    System.out.println("L: " + i);
                    list.remove(i);
                    list.remove(i + 1);
                }

                if (character == '?' && array[0] == '?'){
                    System.out.println("Line: " + i);
                    list.remove(i - 1);
                }
            }
        }
        /*for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }*/
    }
}
