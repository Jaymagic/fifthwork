package work;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class HomeWork2 {

    public void charSet(String date){
        boolean flag = true;
        SimpleDateFormat datef = new SimpleDateFormat("yyyy/mm/dd");
        Date dat = null;
        try{
            dat = datef.parse(date);
        }catch(ParseException e){
            flag = false;
        }finally{
            if(flag){
                System.out.println("ת����������ǣ�"+ dat);
            }else{
                System.out.println("�Բ�������������ڸ�ʽ����ȷ��");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("���������ڣ�");
        String day = s.next();
        HomeWork2 dt = new HomeWork2();
        dt.charSet(day);
    }
}