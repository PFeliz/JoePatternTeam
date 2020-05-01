import java.util.ArrayList;
import java.util.Random;

public class Pet {
    ArrayList<Integer> codList = new ArrayList<Integer>();
    String name;
    String race;
    int age;

    public Pet(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void renamePet(String newName) {
        this.name = newName;
    }

    public int getIDNumb() {
        int cod;
        int kek = 0;
        Random rand = new Random();

        while(true) {
            cod = rand.nextInt(1000)+1000000000;

            if(!codList.contains(cod)) {
                codList.add(cod);
                break;
            }
        }

        return cod;
    }

    public int getTheCode() {
        return codList.get(0);
    }


}