public class Main {
    public static void main(String[] args) {

        Farm f = new Farm();
        Sheep s = new Sheep("Small","Dog",Size.SMALL,"No");
        Rose r = new Rose("rose",50,10,10);
        Cactus c = new Cactus("cactus",60,40,60);
        r.zavlazeni();
        r.zavlazeni();
        f.addFlower(r);
        f.addFlower(c);
        f.sklidit(r);
        f.pohladit(s);
        f.AllFlowers();
        f.addAnimal(s);
        f.AllAnimals();




    }
}