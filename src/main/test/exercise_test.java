import org.junit.Test;
import static org.junit.Assert.*;

import class_exercise;

public class exercise_test {

    @Test
    public void testtriangle0() {
	assertEquals(class_exercise.triangle(0), 0);
    }

    
    @Test
    public void testlazy0() {
	assertEquals(class_exercise(0), 1);
    }   
    
}