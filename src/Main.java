import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String [] args){
        //arrayUnidimensional();
        arraybidimensional();
    }

    private static void arraybidimensional() {
        int [][] matriz1 = {{1,23,89,87,}, {45,86,458,4,4}};
        int [][] matriz2 = {{458,4,41,23}, {45,86,89,87}, {1,24,55}};

        System.out.println("MATRIZ 1");
        outputArray(matriz1);
        System.out.println("MATRIZ 2");
        outputArray(matriz2);

    }

    private static void outputArray(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++){
           for (int coluna = 0; coluna < matriz[linha].length; coluna++){
               System.out.printf("%d", matriz[linha][coluna]);
           }
           System.out.println();
        }
    }

    public static void arrayUnidimensional() {
        int [] a = new int[5];
        int [] b = {5,4,64,64};

        for (int i : a){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(b));
    }


}