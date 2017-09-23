package work;
import java.util.*;


/**
 * <p>title Test
 * @author yuanjie
 * @DATE 2017年9月23日上午10:41:21


 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n;
     System.out.println("请输入一个不小于0的整数：");
     Scanner t=new Scanner(System.in);
     n=t.nextInt();
     System.out.println("输出结果为：");
     CAL(n);
     
	}
	public static void CAL(int i) {
		System.out.println(i);
		if(i<=5000) {
			CAL(2*i );
		}
		System.out.println(i);
			
		
	}

}
