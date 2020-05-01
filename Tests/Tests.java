import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void Test1() {
        String name = "joe";
        Owner joe = new Owner(name, "joe@gmail.com", 21);
        System.out.println("Owner created!");

        String getName = joe.getName();
        assertEquals(name, getName);
    }

    @Test
    public void Test2() {
        String name = null;
        Owner joe = new Owner(name, "joe@gmail.com", 21);
        System.out.println("Owner created!");

        assertThrows(AssertionError.class, ()->{
            String getName = joe.getName();
        });
    }

    @Test
    public void Test3() {
        int pet_id;

        Pet pet = new Pet("Ash","Asherion", 3);

        pet_id = pet.getIDNumb();
        System.out.println("Creating ID...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ID created!");
        assertEquals(pet_id, pet.getTheCode());
    }

    @Test
    public void itIsWednesdayMyDudes() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Owner rob = new Owner("Rob", "bery@gmail.com",27);
        Pet lePet = new Pet("Johnny boy","Johnson",2);
        Pet lePepe = new Pet("Pepe", "sad", 5);

        rob.addPet(lePet);
        rob.addPet(lePepe);

        String petList = "Johnny boy" + "\t"
                + "Johnson" + "\t" + 2 +"\n";
        petList += "Pepe" + "\t"
                + "sad" + "\t" + 5 + "\n";

        rob.getAlPets();

        assertEquals(petList, outContent.toString());
    }
}
