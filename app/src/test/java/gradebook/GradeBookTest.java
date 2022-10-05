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
    @Test
    public void givenSetOf3ScoresOf000GetGradeWillBeF(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('F', gradeBook.getGrade(0,0,0));
    }
    @Test
    public void givenSetOf3ScoresOf959095GetGradeWillBeA(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('A', gradeBook.getGrade(95,90,93));
    }
    @Test
    public void givenSetOf3ScoresOf1008596GetGradeWillBeA(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('A', gradeBook.getGrade(100,85,96));
    }
    @Test
    public void givenSetOf3ScoresOf929394GetGradeWillBeA(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('A', gradeBook.getGrade(92,92,94));
    }
    @Test
    public void givenSetOf3ScoresOf828586GetGradeWillBeB(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('B', gradeBook.getGrade(82,85,87));
    }
    @Test
    public void givenSetOf3ScoresOf847985GetGradeWillBeB(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('B', gradeBook.getGrade(84,79,85));
    }
    @Test
    public void givenSetOf3ScoresOf757079GetGradeWillBeC(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('C', gradeBook.getGrade(75,70,79));
    }
    @Test
    public void givenSetOf3ScoresOf608276GetGradeWillBeC(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('C', gradeBook.getGrade(60,82,76));
    }
    @Test
    public void givenSetOf3ScoresOf657059GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('D', gradeBook.getGrade(65,70,59));
    }
    @Test
    public void givenSetOf3ScoresOf666268GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('D', gradeBook.getGrade(66,62,68));
    }
    @Test
    public void givenSetOf3ScoresOf445552GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('F', gradeBook.getGrade(44,55,52));
    }
    @Test
    public void givenSetOf3ScoresOf485552GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('F', gradeBook.getGrade(48,55,52));
    }
    @Test
    public void givenSetOf3ScoresOf585960GetGradeWillBeD(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('F', gradeBook.getGrade(58,59,60));
    }
}
