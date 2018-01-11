import java.util.ArrayList;

public class Facts {
    public String facts;
    public Facts(ArrayList list){
        String[] splitted;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).toString().indexOf("=") >= 0){
                if(list.get(i).toString().indexOf(">") == -1){
                    splitted = list.get(i).toString().split("=");
                    facts = splitted[1];
                    //System.out.println(facts);
                }
            }
        }
    }
}
