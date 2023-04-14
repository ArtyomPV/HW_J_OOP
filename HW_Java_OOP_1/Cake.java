package HW_Java_OOP.HW_Java_OOP_1;

public class Cake  extends Product{

     private String taste;

    /**
     * Конструктор Продукта
     * @param name наименование
     * @param price стоимость
     * @param taste вкус
     */
    public Cake(String name, double price, String taste) {
        super(name, price);
        this.taste = taste;
    }

    /**
     *
     * @return возвращает вкус Продукта
     */
    public String getTaste() {
        return taste;
    }

    /**
     *
     * @return Выводит в консоль характеристики продукта
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" Taste: %s", taste);
    }
}
