package Main.Builder.BuilderV1;

public class testeAnimal {
    public static void main(String[] args) {
Animal annibal = new Animal.animalBuilder().nome("Annibal")
        .raca("Yorikshire")
        .idade(16)
        .build();
System.out.println(annibal.toString());
    }
}
