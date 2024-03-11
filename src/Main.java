public class Main {
    public static void main(String[] args) {

        Farm f = new Farm();
        Sheep s = new Sheep("Small","Dog",Size.SMALL,"No");
        f.addAnimal(s);
        f.AllAnimals();




    }
}