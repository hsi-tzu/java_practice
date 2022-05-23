
import java.io.FileReader;
import java.io.*;
import java.util.Vector;

public class P12_108601503 {
    public static void main(String[] args) throws IOException {
        Vector<point> point=new Vector<point>();
        Vector<line> line=new Vector<line>();
        Vector<circle> circle=new Vector<circle>();
        try {
            FileReader file1 = new FileReader("m2-2.txt");
            BufferedReader br = new BufferedReader(file1);
            String line1;
            int round=0;
            while ((line1 = br.readLine()) != null) {
                //System.out.println(line1);
                if(round==0){

                    String[] str=line1.split("[\\[|\\]|,]");
                    int value_x = 0;
                    int value_y = 0;
                    int i=0;
                   for(i=0;i< str.length;i++){
                        try {
                            value_x = Integer.parseInt(str[i]);
                            i++;
                            value_y = Integer.parseInt(str[i]);

                        }
                        catch (NumberFormatException e){
                            continue;
                        }

                        point new_point=new point(value_x,value_y);
                        point.add(new_point);
                        //System.out.println(value_x+"kk"+value_y);
                   }
                    round++;
                   continue;
                }
                if(round==1){
                    String[] str=line1.split("[\\[|\\]|,]");
                    int value_x = 0;
                    int value_y = 0;
                    int value_r=0;
                    int i=0;
                    for(i=0;i< str.length;i++){
                        try {
                            value_x = Integer.parseInt(str[i]);
                            i++;
                            value_y = Integer.parseInt(str[i]);
                            i++;
                            value_r = Integer.parseInt(str[i]);

                        }
                        catch (NumberFormatException e){
                            continue;
                        }
                        circle new_circle=new circle(value_x,value_y,value_r);
                        circle.add(new_circle);
                        //System.out.println("c="+circle.size());
                        //System.out.println(value_x+"kk"+value_y+"kk"+value_r);
                    }
                    round++;
                    continue;
                }
                if(round==2){
                    String[] str=line1.split("[\\[|\\]|,]");
                    int value_a = 0;
                    int value_b = 0;
                    int value_c=0;
                    int i=0;
                    for(i=0;i< str.length;i++){
                        try {
                            value_a = Integer.parseInt(str[i]);
                            i++;
                            value_b = Integer.parseInt(str[i]);
                            i++;
                            value_c = Integer.parseInt(str[i]);

                        }
                        catch (NumberFormatException e){
                            continue;
                        }
                        line new_line=new line(value_a,value_b,value_c);
                        line.add(new_line);
                        //System.out.println(value_a+"kk"+value_b+"kk"+value_c);
                    }
                    round++;
                    continue;
                }


            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        //---------------------------判斷點到圓
        for(int j=0;j< circle.size();j++){

            int point_num=0;

            for(int k=0;k< point.size();k++){
                double d=0;
                d=circle.get(j).check_point_num(point.get(k).getX(), point.get(k).getY());
                if(d< circle.get(j).getRadius()){
                    point_num++;
                }
            }
            System.out.print(point_num+" ");

        }
        //-----------------------------判斷直線
        for(int k=0;k<circle.size();k++){
            double d=line.get(0).check_line_d(circle.get(k).getX(),circle.get(k).getY());
            if(d<circle.get(k).getRadius()){
                System.out.print("intersect ");
            }
            else if(d==circle.get(k).getRadius()){
                System.out.print("tangency ");
            }
            else if(d>circle.get(k).getRadius()){
                System.out.print("disjoint ");
            }
        }


    }
}
class point{
    private int x;
    private int y;
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return  y;
    }
}

class line {
    private int a;
    private int b;
    private int c;

    public line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double check_line_d(int x, int y) {
        double v = (Math.abs(this.a * x + this.b * y + this.c)) / (Math.pow(this.a * this.a + this.b * this.b, 0.5));
        return v;
    }
}

class circle{
    private int x;
    private int y;
    private int radius;
    public circle(int x,int y,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double check_point_num(int x,int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    public int getRadius(){
        return radius;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
