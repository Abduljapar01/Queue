package ContohQueue;

public class Main {
    public static void main(String[] args) {

    DataNama DaniAndani = new DataNama("Abdul","Japar",1);
    DataNama AzisBanon = new DataNama("Dani","Andani",2);
    DataNama AbdulJapar = new DataNama("Chaerultry","Julianto",3);

    ArrayList queue = new ArrayList(5);
    queue.add(DaniAndani);
    queue.add(AzisBanon);
    queue.add(AbdulJapar);

    //queue.remove();
    //queue.remove();
    //queue.remove();

    queue.printQueue();
    }
}