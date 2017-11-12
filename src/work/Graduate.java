package work;

/**
 * <p>title Graduate
 * @author Admin
 * @DATE 2017年11月11日下午8:29:08


 */
public class Graduate implements StudentManageInterface,TeacherManageInterface{
	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
	Graduate(String n,String s,int a){
		this.name=n;
		this.sex=s;
		this.age=a;
	}
	public void setPay(double p) {
		pay=p;
	}
	public double getPay() {
		return 10*pay;
	}
	public void setFee(double f) {
		fee=f;
	}
	public double getFee() {
		return 2*fee;
	}
	
	
	public static void main(String[] args) {
		
		Graduate man=new Graduate("zhangsan","男",22);
		man.setPay(5000);
		man.setFee(6000);
		if((man.getPay()-man.getFee())<=2000) 
			System.out.println("Provide a loan");
		else
			System.out.println("Get all is"+(man.getPay()-man.getFee()));
			
		
		// TODO Auto-generated method stub

	}

}
interface TeacherManageInterface{
	public void setPay(double p);
	public double getPay();
}
interface StudentManageInterface{
	public void setFee(double f);
	public double getFee();
}