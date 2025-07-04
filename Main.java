public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.enqueue("Ivan");
        market.enqueue("Maria");

        market.printQueueStatus();

        market.takeOrder("Ivan");
        market.takeOrder("Pavel"); // Example: person not in the queue

        market.giveOrder(); // Ivan receives order and is removed

        market.dequeue(); // Maria leaves manually

        market.update(); // Queue check + process pending orders
    }
}
