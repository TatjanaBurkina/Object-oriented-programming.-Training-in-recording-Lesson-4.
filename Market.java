import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private final Queue<String> queue = new LinkedList<>();
    private final Queue<String> orders = new LinkedList<>();

    @Override
    public void takeInQueue(String person) {
        queue.add(person);
        System.out.println(person + " встал в очередь.");
    }

    @Override
    public void releaseNextFromQueue() {
        if (!queue.isEmpty()) {
            String person = queue.poll();
            System.out.println(person + " ушел из очереди.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    public void printQueueStatus() {
        System.out.println("Текущая очередь: " + queue);
    }

    @Override
    public void takeOrder(String person) {
        if (queue.contains(person)) {
            orders.add(person);
            System.out.println(person + " сделал заказ.");
        } else {
            System.out.println(person + " не в очереди — заказ не принят.");
        }
    }

    @Override
    public void giveOrder() {
        if (!orders.isEmpty()) {
            String person = orders.poll();
            System.out.println("Заказ передан клиенту: " + person);
            queue.remove(person);
            System.out.println(person + " покидает очередь после получения заказа.");
        } else {
            System.out.println("Нет заказов для обработки.");
        }
    }

    @Override
    public void update() {
        printQueueStatus();
        giveOrder();
    }
}
