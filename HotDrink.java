public class HotDrink {
    private final String name;    // Name of the drink
    private final int volume;     // Volume in milliliters

    // Constructor for the base class
    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // Method to display drink information
    @Override
    public String toString() {
        return "Drink: " + name + ", volume: " + volume + " ml";
    }
}
