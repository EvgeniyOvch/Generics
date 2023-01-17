public class Main {
    public static void main(String[] args) {
        MagicBox <Integer> magicBox = new MagicBox<>();

        magicBox.add(10000);
        magicBox.add(14000);
        magicBox.add(7745);
        magicBox.add(24444);
        magicBox.pick();

        //MagicBox <String> magicBox = new MagicBox<>();

        //magicBox.add("Картошка");
        //magicBox.add("Конфетка");
        //magicBox.add("Яблоко");
        //magicBox.add("Груша");
        //magicBox.pick();
    }
}