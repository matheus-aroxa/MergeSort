import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    private static final String[] actions = {"1 - Definir um array", "2 - Exibir passos intermediários", "3 - Aplicar MergeSort", "4 - Sair"};
    private static Scanner scanner = new Scanner(System.in);
    private static boolean exibirPassosIntermediarios = false;
    private static String[] stringArray;
    private static int[] intArray;


    public static void start(){
        int action = 0;
        do {
            showActions();
            action = scanner.nextInt();
            handleActions(action);
        } while(action != 4);
    }

    private static void showActions(){
        for(String action: actions){
            System.out.println(action);
        }
    }

    private static void handleActions(int action){


        switch (action) {
            case 1:
                System.out.println("Digite os valores do array (inteiros): ");

                scanner.nextLine();
                stringArray = scanner.nextLine().split(" ");
                intArray = new int[stringArray.length];

                for(int i = 0; i < stringArray.length; i++){
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }

                System.out.println("Array definido: " +  Arrays.toString(intArray));
                break;
            case 2:
                if(exibirPassosIntermediarios){
                    System.out.println("A exibição de passos intermediários foi desativada");
                    exibirPassosIntermediarios = false;
                } else {
                    System.out.println("A exibição de passos intermediários foi ativada");
                    exibirPassosIntermediarios = true;
                }
                break;
            case 3:
                if(intArray == null){
                    System.out.println("Não é possível realizar a operação pois o vetor não foi devidamente inicializado");
                } else {
                    System.out.println("Aplicando MergeSort no vetor");
                    MergeSort.mergeSort(intArray, 0, intArray.length-1, exibirPassosIntermediarios);
                    System.out.println("Vetor ordenado: " + Arrays.toString(intArray));
                }
                break;
            case 4:
                System.out.println("Saindo ...");
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
