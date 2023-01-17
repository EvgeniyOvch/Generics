import java.util.Random;

public class MagicBox<T> {
    protected T[] items = (T[]) new Object[40];

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println((i + 1) +  "." + item);
                return true;
            }
        }
        System.out.println("Коробка полная,мест больше нет :(");
        return false;
    }

    public T pick() {
        int arrayLength = items.length;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Kоробка не полная,осталось ещё заполнить ячеек: " + (arrayLength - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(arrayLength);
        System.out.println("Тебе выпал номер № " + (randomInt + 1) + " УРА!!!!");
        return null;
    }
}
