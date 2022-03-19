/**
 Practice 3
 Student Number：108601503
 Course：2022-CE1004-A
 */
class Student{
    public Student(String NAME,int SCORE){
        this.name=NAME;
        this.score=SCORE;
    }
    private String name;
    private int score;
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void changeScore(int new_score){
        score=new_score;
    }

}
public class P3_108601503 {
    public static void main(String[] args) {
        // 以下不要改
        Student putin = new Student("Putin", 59);
        System.out.println(putin.getName() + " before: " + putin.getScore());
        putin.changeScore(40);
        System.out.println(putin.getName() + " after: " + putin.getScore());
//        putin.score = 100;
    }
}


