// Родительский класс ГорячийНапиток
public class ГорячийНапиток {
    private final String name;    // Название напитка
    private final int volume;     // Объем напитка

    //  Конструктор родительского класса
    public ГорячийНапиток(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    //  Геттеры для доступа к данным
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //  Метод для вывода информации
    @Override
    public String toString() {
        return "Напиток: " + name + ", объем: " + volume + " мл";
    }
}
