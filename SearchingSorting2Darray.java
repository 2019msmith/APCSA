import java.util.*;
public class SearchingSorting2Darray{
    public static void columnSort(int arr[][], int col){
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare (final int[] entry1, final int[] entry2){
                if(entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });
    }
    public static void main(String args[]){
        int Points[][] = { { 34, 42, 10 },
                           { 1, 31, 22 },
                           { 14, 18, 15 },
                           { 50, 29, 23 } };
        int col = 3;
        columnSort(Points, col-1);
        for(int i=0; i<Points.length; i++){
            for(int j=0; j<Points[i].length; j++){
                System.out.print(Points[i][j] + " ");
            }
            System.out.println();
        }
    }
}