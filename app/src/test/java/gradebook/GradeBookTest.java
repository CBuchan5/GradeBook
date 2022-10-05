package gradebook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeBookTest {
    @Test
    public void givenSetOf3ScoresOf100100100GetGradeWillBeA(){
        GradeBook gradeBook = new GradeBook();
        assertEquals('A', gradeBook.getGrade(100,100,100));
    }
}
