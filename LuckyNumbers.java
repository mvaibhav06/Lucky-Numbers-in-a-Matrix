import java.util.ArrayList;
import java.util.*;

public class LuckyNumbers {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer,Integer> columns = new HashMap<>();

        for(int i=0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            columns.put(i,max);
        }
        List<Integer> out = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int index = -1;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            if(columns.get(index) == min){
                out.add(min);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(nums));

    }
}
