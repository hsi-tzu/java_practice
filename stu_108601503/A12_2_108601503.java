package stu_108601503;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

//import static sun.security.util.DisabledAlgorithmConstraints.DenyAfterConstraint.dateFormat;

public class A12_2_108601503 {
    public static void main(String[] args){
        Vector<time> record=new Vector<time>();
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        Vector<Date> date=new Vector<Date>();
        Vector<String> text=new Vector<String>();
        try {
            Document document = Jsoup.connect("https://www.csie.ncu.edu.tw/").get();
            int length = document.select("div.item-title").size();
            // int length_2=document.select("div.item-time").size();
            for (int i = 0; i < length; i++) {
//                System.out.println(document.select("div.item-title").get(i).text());
//                System.out.println(document.select("div.item-time").get(i).text());

//                String year = document.select("div.item-time").get(i).text().substring(0, 4);
//                String month = document.select("div.item-time").get(i).text().substring(5, 7);
//                String day = document.select("div.item-time").get(i).text().substring(8, 10);
//                time time_item = new time(year, month, day, document.select("div.item-title").get(i).text(), document.select("div.item-time").get(i).text());
//                record.add(time_item);
                text.add(document.select("div.item-title").get(i).text());
                try {
                    Date date1 = dateFormat.parse(document.select("div.item-time").get(i).text());
                    date.add(date1);
                } catch (ParseException ex) {

                }
//                System.out.println(record.get(i).getYear()+" "+record.get(i).getMonth()+" "+record.get(i).getDay());
//                System.out.println(record.get(i).getDate());
            }
            //-----------------------排序
            for (int i = 0; i < length; i++) {
                int index = -1;

                Date date_big=dateFormat.parse("0000-00-00");
                //Date date_change=dateFormat.parse("0000-00-00");
                for (int j = 0; j < length; j++) {
                    if (date.get(j).after(date_big)) {
                        date_big=date.get(j);
                        index=j;
                    }
                    System.out.println(index);
                    System.out.println(date_big+" "+text.get(index));
                    date.remove(index);
                    text.remove(index);

                }


            }
        }
        catch (IOException e){
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
class time{
    private int year;
    private int month;
    private int day;
    private String text;
    private String date;
    public time(String year,String month,String day,String text,String date){
        this.year=Integer.parseInt(year);
        this.month=Integer.parseInt(month);
        this.day=Integer.parseInt(day);
        this.text=text;
        this.date=date;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public  String getText(){
        return this.text;
    }
    public String getDate(){
        return this.date;
    }
    public void changeDate(){
        this.year=-1;
        this.month=-1;
        this.day=-1;
    }


}