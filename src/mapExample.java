import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class mapExample {
    public static void main (String args[]) {
        //simpleMap();
        linkedHashMapExample();
    }

    private static void linkedHashMapExample() {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int votesSofar = votes.get(name);
                    votes.put(name, count + votesSofar);
                } else {
                    votes.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static void simpleMap (){
        Map<String, Pessoa> mapa = new HashMap<>();

        Pessoa joao = new Pessoa(1L, "joão");

        mapa.put("1L", joao);

        Pessoa joao2 = mapa.get("1L");

        System.out.println(joao2.nome);
        mapa.remove("1l");
        System.out.println(mapa.containsKey("1l"));
    }

}
