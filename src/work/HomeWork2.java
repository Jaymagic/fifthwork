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
                System.out.println("转换后的日期是："+ dat);
            }else{
                System.out.println("对不起，你输入的日期格式不正确！");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入日期：");
        String day = s.next();
        HomeWork2 dt = new HomeWork2();
        dt.charSet(day);
    }
}