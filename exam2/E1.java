package exam2;
import java.util.*;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Vector<item> car=new Vector<item>();
        while (true){
            System.out.println("請選擇一指令\n添加商品:add\n查詢購物車商品:query\n修改商品數量:update\n結算金額:pay");
            String ins;
            ins=scanner.next();
            if(Objects.equals(ins, "exit")){
                break;
            }

            else if(Objects.equals(ins, "add")) {
                item new_item = new item();
                car.add(new_item);
            }
            else if(Objects.equals(ins, "query")) {
                System.out.println("============購物車內容如下============");
                System.out.println("編號       名稱        價格        數量");
                for (int i = 0; i < car.size(); i++) {
                    car.get(i).query();
                }
            }
             else if(Objects.equals(ins, "update")) {
                System.out.println("請輸入需要修改的商品編號");
                int no_update = scanner.nextInt();
                int check = 0;
                for (int i = 0; i < car.size(); i++) {
                    if (car.get(i).getNo() == no_update) {
                        car.get(i).update();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("無此商品");
                }
            }
             else if (Objects.equals(ins, "pay")) {
                int total_count = 0;
                System.out.println("============購物車內容如下============");
                System.out.println("編號       名稱        價格        數量");
                for (int i = 0; i < car.size(); i++) {
                    car.get(i).query();
                    total_count = total_count + car.get(i).getTotal_Price();
                }
                System.out.println("訂單總金額" + total_count);
            }
            else{
                System.out.println("沒有該功能");
            }
        }

    }
}

class item{
    Scanner scanner=new Scanner(System.in);
    private String name;
    private int no;
    private int price;
    private int count;
    public item(){
        System.out.println("請輸入商品編號:");
        this.no=scanner.nextInt();
        System.out.println("請輸入商品名稱:");
        this.name=scanner.next();
        System.out.println("請輸入商品價格:");
        this.price=scanner.nextInt();
        System.out.println("請輸入商品數量:");
        this.count= scanner.nextInt();
        System.out.println("您的商品："+this.name+"已添加到購物車");

    }
    public int getNo(){
        return this.no;
    }
    public int getTotal_Price(){
        return (this.price*this.count);
    }
    public void query(){


        System.out.println(this.no+"       "+this.name+"       "+this.price+"       "+this.count);
    }
    public void update(){
        System.out.println("請輸入商品"+this.name+"的修改數量");
        this.count=scanner.nextInt();
        System.out.println("修改完成");
        System.out.println("============購物車內容如下============");
        System.out.println("編號       名稱        價格        數量");
        query();

    }
}