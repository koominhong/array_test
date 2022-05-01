import java.util.Arrays;

public class arra {
    public static void main (String[] args){
        int [][] array = new int[10][10];
        int num =1;
        for (int i = 0; i < 10; i++){
            for (int j =0; j < 10; j++){
                array[i][j] = num;
                num++;
                System.out.print("[" + array[i][j]+ "]"+" ");

            }
            System.out.println();

        }

    }
}

