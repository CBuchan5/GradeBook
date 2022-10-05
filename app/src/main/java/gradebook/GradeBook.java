package gradebook;

public class GradeBook {
    public char getGrade(int s1, int s2, int s3){
        int getAverageScore = (s1 + s2 + s3)/3;
        if(getAverageScore >= 90 && getAverageScore <=100) {
            return 'A';
        }else if (getAverageScore >=80) {
            return 'B';
        }else if (getAverageScore >= 70){
            return 'C';
        }else if (getAverageScore >=60) {
            return 'D';
        }
        return 'F';
    }

}
