package gradebook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeBookTest {
    @Test
    public void givenSetOf3ScoresOf100100100GetGradeWillBeA(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('A', gradeBook.getGrade(100,100,100));
    }
    @Test
    public void givenSetOf3ScoresOf7070100GetGradeWillBeB(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('B', gradeBook.getGrade(70,70,100));
    }
    @Test
    public void givenSetOf3ScoresOf707070GetGradeWillBeC(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('C', gradeBook.getGrade(70,70,70));
    }
    @Test
    public void givenSetOf3ScoresOf586270GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('D', gradeBook.getGrade(58,62,70));
    }
    @Test
    public void givenSetOf3ScoresOf4455520GetGradeWillBeF(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('F', gradeBook.getGrade(44,55,52));
    }

}
