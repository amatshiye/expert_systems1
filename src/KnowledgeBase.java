import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class KnowledgeBase {
   public ArrayList list = new ArrayList();

    public void createList(String arg) throws Exception{
        File file = new File("src/" + arg);

        if (file.exists()){
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                list.add(scanner.nextLine());
            }

        }else{
            System.out.println("File not found");
        }
    }

    public KnowledgeBase(String[] args) throws Exception{

        if (args.length > 1){
            System.out.println("Too many arguments passed");
            System.exit(1);
        }
        else if (args.length < 1){
            System.out.println("No arguments found");
            System.exit(1);
        }
    }
}
