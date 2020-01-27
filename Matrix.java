import java.util.Arrays;


public class Matrix {


    private int[][] twoD_arr;

    public static void main(String[] args) {
        Matrix mt=new Matrix();
        mt.create(3, 3, new int[]{1,2,3,4,5,6,7,8,9});
        mt.multElement(2);
    }

    public static void print2D(int mat[][])
    {
        for (int[] row : mat) { System.out.println(Arrays.toString(row)); }
        System.out.println();

    }

    public void create(int rows,int cols,int[] values){
        twoD_arr=new int[rows][cols];
        int x=0;
        int y=0;
        for (int val : values) {
            if(x==cols){
                y++;
                x=0;
            }
            twoD_arr[y][x]=val;
            x++;
        }
        print2D(twoD_arr);
    }

    public void multElement(int factor){
        for (int i = 0; i < twoD_arr.length; i++) {
            for (int j = 0; j < twoD_arr[i].length; j++) {
                twoD_arr[i][j]=twoD_arr[i][j]*factor;
            }
        }
        print2D(twoD_arr);
    }


}