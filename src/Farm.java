import java.util.ArrayList;

public class Farm {

    int i = 0;

    ArrayList<Animal>animals = new ArrayList<>();
    ArrayList<Flower>flowers = new ArrayList<>();

    public void AllAnimals(){
        System.out.println(animals);
    }


    public void addAnimal(Animal a){
        animals.add(a);
        i++;
    }



}
