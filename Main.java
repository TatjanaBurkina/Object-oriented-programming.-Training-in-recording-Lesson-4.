public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.takeInQueue("Иван");
        market.takeInQueue("Мария");

        market.printQueueStatus();

        market.takeOrder("Иван");
        market.takeOrder("Павел"); // Пример, когда человек не в очереди

        market.giveOrder(); // Иван получает заказ и удаляется

        market.releaseNextFromQueue(); // Мария уходит вручную

        market.update(); // Проверка очереди + обработка заказов
    }
}
