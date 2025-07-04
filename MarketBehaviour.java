// interface MarketBehaviour {
//     void takeOrder(String person);
//     void giveOrder();
// }
public interface MarketBehaviour {
    void takeOrder(String person);
    void giveOrder();
    void update(); // Обновление состояния магазина
}
