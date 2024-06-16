package Main.Builder;

public class PersonBuilderTest {
    public static void main(String[] args) {
        Person joshua = new Person.PersonBuilder()
                .Name("Joshua")
                .Forname("Reeves")
                .Age(17)
                .Gender("Girl")
                .build();
        System.out.println(joshua.toString());
    }
}
