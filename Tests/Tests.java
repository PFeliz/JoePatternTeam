//antipattern found cuckoo, only the test class was used for all the tests in question
public class Tests {
    /*
        Anti pattern found Test-per-Method it only has one method for each test
        other anti pattern found is The Loudmouth, that have unnecessary messages for implementation of test
    */
    @Test
    //antipattern found Enumerator,several tests listed without any information about the test: Test1, Test2,Test3
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
    /*
      Anti pattern found Slow Poke, has a 3 sec time cycle
      Thread.sleep(3000)
      Making the function slow down for the testing in cause
    */
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
