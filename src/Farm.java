import java.util.ArrayList;

public class Farm {

    int i = 0;
    int x = 0;

    ArrayList<Animal>animals = new ArrayList<>();
    ArrayList<Flower>flowers = new ArrayList<>();

    public void AllAnimals(){
        System.out.println(animals);
    }

    public void AllFlowers(){
        System.out.println(flowers);
    }


    public void addAnimal(Animal a){
        if(i < 21) {
            animals.add(a);
            i++;
        }else{
            System.out.println("You cant add more Animals");
        }
    }
    public void addFlower(Flower f){
        if(x < 5){
            flowers.add(f);
            x++;
        }else{
            System.out.println("You can plant just 5 types of flowers");
        }
    }
    public void sklidit(Flower f){
        flowers.remove(f);
    }
}
