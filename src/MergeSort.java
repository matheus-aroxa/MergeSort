import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r, boolean exibirPassosIntermediarios) {
        if(exibirPassosIntermediarios) {
            System.out.printf("Merge Sort<%d><%d> empilhado\n", l, r);
        }
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid,  exibirPassosIntermediarios);
            mergeSort(arr, mid+1, r,   exibirPassosIntermediarios);
            merge(arr, l, mid, r, exibirPassosIntermediarios);
        }
        if(exibirPassosIntermediarios) {
            System.out.printf("Merge Sort<%d><%d> desempilhado\n", l, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r, boolean exibirPassosIntermediarios) {
        if(exibirPassosIntermediarios) {
            System.out.printf("Aplicando merge<%d><%d><%d>\n", l, mid, r);
        }
        int[] temp = new int[arr.length];

        for(int i = l; i <= r; i++){
            temp[i] = arr[i];
        }

        int i = l, j = mid+1;
        for(int k = l; k <= r; k++){
            if(i > mid){
                arr[k] = temp[j++];
            }
            else if(j > r){
                arr[k] = temp[i++];
            }
            else if(temp[i] < temp[j]){
                arr[k] = temp[i++];
            }
            else{
                arr[k] = temp[j++];
            }
        }
        if(exibirPassosIntermediarios) {
            System.out.printf("Vetor após merge<%d><%d><%d>: ", l, mid, r);
            System.out.println(Arrays.toString(arr));
        }
    }
}