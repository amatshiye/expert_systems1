public class Main {
    public static void main(String[] args) throws Exception{
        KnowledgeBase base = new KnowledgeBase(args);
        base.createList(args[0]);
        Queries qui = new Queries(base.list);
        Facts facts = new Facts(base.list);
        Rules rules = new Rules(base.list);

        for (int i = 0; i < base.list.size(); i++){
            System.out.println(base.list.get((i)));
        }

        System.out.println("End");
    }
}
