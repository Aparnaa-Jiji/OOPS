interface Sports{
    int getSportsScore();
}
class Student{
    private int academicScore;
    public void setAcademicScore(int score){
        academicScore = score;
    }
    public int getAcademicScore(){
        return academicScore;
    }
}

class Results extends Student implements Sports{
    private int sportsScore;
    public void setSportsScore(int score){
        sportsScore = score;
    }

    public int getSportsScore(){
        return sportsScore;
    }
    public void displayScores(){
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

public class MainINTER{
    public static void main(String[] args){
        Results studentResults = new Results();
        studentResults.setAcademicScore(91);
        studentResults.setSportsScore(85);
        studentResults.displayScores();
    }
}