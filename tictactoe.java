package practice.practiceDay2;
import java.util.Scanner;
public class tictactoe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int twoD[][] = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        drawGrid(twoD);
    }
    static void drawGrid(int[][] twoD){
        for (int i=0; i<twoD.length; i++){
            for(int j=0; j<twoD.length; j++){
                System.out.print(" "+twoD[i][j]+" ");
                if(j+1<twoD.length){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i+1<twoD.length){
                System.out.println("-----------");
            }
        }
    }
}
