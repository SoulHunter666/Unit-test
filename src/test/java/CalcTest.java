import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    Calc c1 = new Calc();
    int actual;
    int expected;

    @Test
    public void sum() {
        actual = c1.sum(5,5);
        expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    public void razn() {
        actual = c1.razn(5,1);
        expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void umn() {
        actual = c1.umn(2,2);
        expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void del() {
        actual = c1.del(25,5);
        expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void per() {
    actual = c1.per(4);
    expected = 16;
    assertEquals(expected,actual);
    }
}