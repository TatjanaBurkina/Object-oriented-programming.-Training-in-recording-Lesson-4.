public interface MarketBehavior {
    void takeOrder(String person);
    void giveOrder();
    void update(); // Update the market state
}
