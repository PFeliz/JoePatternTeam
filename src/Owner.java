import java.util.ArrayList;

public class Owner {
    String name;
    String email;
    int age;

    ArrayList<Pet> petList = new ArrayList<Pet>();

    public Owner(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public void getAlPets() {
        for(int i =0; i < petList.size(); i++)
            System.out.print(petList.get(i).getName() + "\t"
                    + petList.get(i).getRace() + "\t" + petList.get(i).getAge() + "\n");
    }

    public String getName() {
        if(name == null)
            throw new AssertionError("Deez nut");
        else
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        if(email == null)
            throw new AssertionError("Deez nut");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        if(name == null)
            throw new AssertionError("Deez nut");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}