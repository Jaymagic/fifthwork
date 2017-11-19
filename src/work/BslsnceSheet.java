package work;
import java.util.*;

/**
 * <p>title BslsnceSheet
 * @author Admin
 * @DATE 2017年11月19日下午1:02:55


 */
public class BslsnceSheet {
	

	public static void main(String[] args) {
		System.out.println("请输入一个16进制数：");
		Scanner in=new Scanner(System.in);
		String t=in.next();
		change t_0=new change(t);
		try {
			t_0.ChangeTst();
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		// TODO Auto-generated method stub

	}
}
class change{
	String s;
	private int n;
	change(String s){
		this.s=s;
	}
	int getN(int n) {
		return n;
	}
	void setN(int n){
		this.n=n;
	}
	void ChangeTst() {
		int n=0;
		int i ,j;
		for(i=0;i<s.length();i++) {
			j=Change(s.charAt(i));
			n+=j*Math.pow(16, s.length()-(i+1));
		}
		System.out.println("成功装换为10进制数为："+n);
				
		}
    int Change(char h)  {   
	     int x;   
	 switch(h)    
	   {    
	   case'0': x=0;  break;    
	   case'1': x=1; break;   
	   case'2': x=2;  break;    
	   case'3': x=3; break;   
	   case'4': x=4; break;    
	   case'5': x=5; break;    
	   case'6': x=6; break;   
	   case'7': x=7; break;    
	   case'8': x=8; break;   
	   case'9': x=9; break;  
	   case'A':  
	   case'a': x=10; break;    
	   case'B':  
	   case'b': x=11; break;   
	   case'C':  
	   case'c': x=12; break;   
	   case'D':  
	   case'd': x=13; break;  
	   case'E':  
	   case'e': x=14; break;  
	   case'F':  
	   case'f': x=15; break;   
	   default:   
	       throw new RuntimeException("十六进制数输入异常");  
	   }  
	       return x;   
	   
	}   
	}  
