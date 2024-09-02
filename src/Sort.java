import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String args []) {
        inputArray();
    }

    public static void inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE OS NUMEROS SEPARADOS POR ',': ");
        String resposta = scanner.next();

        String[] vetStr = resposta.split(",");
        int[] vetor = convert(vetStr);

        Arrays.sort(vetor);

        for (int i : vetor){
            System.out.print(i);
        };
   }

   private static int[] convert(String[] vetStr) {
        int [] numeros = new int[vetStr.length];

        for (int i = 0; i< vetStr.length; i++){
            numeros[i] = Integer.parseInt(vetStr[i]);
        }

        return numeros;
   }
}
