public class Main {
    public static void main(String[] args) {
        Owner dins = new Owner("Dins", "dinsanhez12@hotmail.com", 34);

        Pet xico = new Pet("Xico", "American Wirehair", 8);
        Pet sven = new Pet("Sven","Pastor-alemão",7);

        dins.addPet(xico);
        dins.addPet(sven);

        dins.getAlPets();
    }
}
