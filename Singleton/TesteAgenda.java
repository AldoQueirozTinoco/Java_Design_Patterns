package Main.Singleton;

public class TesteAgenda {

    public static void main(String[] args) {
    /*reservaDia("Sabado");
    reservaDia("Domingo");*/

        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaLAZY("Segunda");
        reservaDiaLAZY("Terca");

    /* No entanto, o construtor declarado, mesmo privado, ainda pode ser acessado com
    *   Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
    *   construtorTravesso.setAccesible(true);
    *
    *
    *   */
    }
    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }//ENUM é o método de Singleton mais utilizado por conta de sua proteção contra ataques REFLECTION como dito lá em cima
}
