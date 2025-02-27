package Main.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static  AgendaSingletonLAZY INSTANCE = null;

    private  Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonLAZY() {
        // Os construtores foram privados para evitar a criação de instâncias diferentes de Agenda
        // Como new AgendaSingletonLAZY();
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public static AgendaSingletonLAZY getInstance(){
        if(Objects.isNull(INSTANCE)){
        INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }else {
        return INSTANCE;}
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }
    public void ocupa(String dia){
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
