import java.util.HashMap;
import java.util.Map;

public class mapExample {
    public static void main (String args[]) {
        simpleMap();
    }

    private static void simpleMap (){
        Map<String, Pessoa> mapa = new HashMap<>();

        Pessoa joao = new Pessoa(1L, "joão");

        mapa.put("1L", joao);

        Pessoa joao2 = mapa.get("1L");

        System.out.println(joao2.nome);
    }

}
