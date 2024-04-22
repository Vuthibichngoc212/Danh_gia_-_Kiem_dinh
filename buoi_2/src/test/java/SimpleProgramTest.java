import org.junit.jupiter.api.Test;

import tuan1_buoi2.SimpleProgram;

public class SimpleProgramTest {

    // Issue 1: Viết các ca kiểm thử JUnit để bao phủ tất cả các lệnh trong chương trình

    @Test
    public void testRunProgram_WithPositiveNumber_PrintsEvenAndOdd() {
        SimpleProgram program = new SimpleProgram();
        program.runProgram(5);
    }

    @Test
    public void testRunProgram_WithNegativeNumber_PrintsErrorMessage() {
        SimpleProgram program = new SimpleProgram();
        program.runProgram(-5);
    }

    // Issue 2: Viết các ca kiểm thử JUnit để bao phủ tất cả các đường đi trong chương trình

    @Test
    public void testRunProgram_WithZero_PrintsErrorMessage() {
        SimpleProgram program = new SimpleProgram();
        program.runProgram(0);
    }

    @Test
    public void testRunProgram_WithEvenNumber_PrintsOnlyEvenNumbers() {
        SimpleProgram program = new SimpleProgram();
        program.runProgram(4);
    }

    @Test
    public void testRunProgram_WithOddNumber_PrintsOnlyOddNumbers() {
        SimpleProgram program = new SimpleProgram();
        program.runProgram(3);
    }
}