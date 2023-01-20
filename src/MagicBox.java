import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox (int sixeMagicBox){
        this.items = (T[]) new Object[sixeMagicBox];
    }
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
        int length = items.length;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Kоробка не полная,осталось ещё заполнить ячеек: " + (length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(length);
        System.out.println("Тебе выпал номер № " + (randomInt + 1) + " УРА!!!!");
        return null;
    }
}
