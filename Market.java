import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehavior {
    private final Queue<String> queue = new LinkedList<>();
    private final Queue<String> orders = new LinkedList<>();

    @Override
    public void enqueue(String person) {
        queue.add(person);
        System.out.println(person + " joined the queue.");
    }

    @Override
    public void dequeue() {
        if (!queue.isEmpty()) {
            String person = queue.poll();
            System.out.println(person + " left the queue.");
        } else {
            System.out.println("The queue is empty.");
        }
    }

    public void printQueueStatus() {
        System.out.println("Current queue: " + queue);
    }

    @Override
    public void takeOrder(String person) {
        if (queue.contains(person)) {
            orders.add(person);
            System.out.println(person + " placed an order.");
        } else {
            System.out.println(person + " is not in the queue — order not accepted.");
        }
    }

    @Override
    public void giveOrder() {
        if (!orders.isEmpty()) {
            String person = orders.poll();
            System.out.println("Order delivered to: " + person);
            queue.remove(person);
            System.out.println(person + " leaves the queue after receiving the order.");
        } else {
            System.out.println("No orders to process.");
        }
    }

    @Override
    public void update() {
        printQueueStatus();
        giveOrder();
    }
}
