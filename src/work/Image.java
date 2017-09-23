package work;

/**
 * <p>title Image
 * @author yuanjie
 * @DATE 2017年9月22日下午9:42:44


 */
import java.util.*;
public class Image {  
	public static int N;
    int [][] result = new int[N][N];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入你想生成的方阵边长：");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		N = n;
		Image rm = new Image();  
        rm.generateRotate(1, 0, N);  
        rm.printResult();  
    }  
      
    //生成旋转矩阵  
    public void generateRotate(int number, int begin, int size){  
    	
    	if(size == 1){  
            result[begin][begin] = number;  
            return;  
        }  
          
        if(size == 0){  
            return;  
        }  
        //生成区域A  
        int i = begin;  
        int j = begin;  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i++;  
        }  
          
        //生成区域B  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j++;  
        }  
          
        //生成区域C  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i--;  
        }  
          
        //生成区域D  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j--;  
        }  
          
        //递归调用  
        generateRotate(number, begin + 1, size - 2);  
    }  
      
    public void printResult(){  
        for(int i = 0; i < N; i++){  
            for(int j = 0; j < N; j++){  
                System.out.print(result[i][j] + "   ");  
                if(j == N - 1){  
                    System.out.println();  
                }  
            }  
        }  
    }  
}
