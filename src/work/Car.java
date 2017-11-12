package work;

/**
 * <p>title Car
 * @author Admin
 * @DATE 2017年11月11日下午7:34:41


 */
public class Car {
	ComputerWeight[] goods;
	double AllWeight=0;
	Car(ComputerWeight[] goods){
		this.goods=goods;
	}

	public static void main(String[] args) {
		ComputerWeight[] goods=new ComputerWeight[3];
		goods[0]=new Computer(100.5);
		goods[1]=new Telvision(95.6);
		goods[2]=new Washmachine(200.3);
		double AllWeight=goods[0].computerWeight()+goods[1].computerWeight()+goods[2].computerWeight();
		System.out.println("总载重为"+AllWeight);
		// TODO Auto-generated method stub

	}

}

interface ComputerWeight {
	public double computerWeight();
	
}
 class Computer implements ComputerWeight{
	 double Cweight;
	 Computer(double c){
		 this.Cweight=c;
	 }
	 public double computerWeight() {
		 return Cweight;
	 }
}
 class Telvision implements ComputerWeight{
	 double Tweight;
	 Telvision(double t){
		 this.Tweight=t;
	 }
	 public double computerWeight() {
		 return Tweight;
	 }
}
class Washmachine implements ComputerWeight{
	 double Wweight;
	 Washmachine(double w){
		 this.Wweight=w;
	 }
	 public double computerWeight() {
		 return Wweight;
	 }
}