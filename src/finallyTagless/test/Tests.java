package finallyTagless.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import finallyTagless.Samples;
import finallyTagless.impl.EvalImpl;
import finallyTagless.impl.EvalMImpl;
import finallyTagless.impl.ViewImpl;
import finallyTagless.impl.ViewMImpl;

public class Tests {

    @Test
    public void testEval() {
        Integer res0 = Samples.one(new EvalImpl());
        Integer res1 = Samples.two(new EvalImpl());

        assertEquals(5, res0.intValue());
        assertEquals(15, res1.intValue());
    }

    @Test
    public void testView() throws Exception {
        String res0 = Samples.one(new ViewImpl());
        String res1 = Samples.two(new ViewImpl());

        assertEquals("(8 + (-(1 + 2)))", res0);
        assertEquals("(10 + (8 + (-(1 + 2))))", res1);
    }

    @Test
    public void testEvalM() {
        Integer res0 = Samples.one(new EvalMImpl());
        Integer res1 = Samples.two(new EvalMImpl());
        Integer res2 = Samples.three(new EvalMImpl());
        Integer res3 = Samples.four(new EvalMImpl());

        assertEquals(5, res0.intValue());
        assertEquals(15, res1.intValue());
        assertEquals(15, res2.intValue());
        assertEquals(60, res3.intValue());
    }

    @Test
    public void testViewM() throws Exception {
        String res0 = Samples.one(new ViewMImpl());
        String res1 = Samples.two(new ViewMImpl());
        String res2 = Samples.three(new ViewMImpl());
        String res3 = Samples.four(new ViewMImpl());

        assertEquals("(8 + (-(1 + 2)))", res0);
        assertEquals("(10 + (8 + (-(1 + 2))))", res1);
        assertEquals("(3 * (8 + (-(1 + 2))))", res2);
        assertEquals("(4 * (10 + (8 + (-(1 + 2)))))", res3);
    }

}
