package finallyTagless.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import finallyTagless.Samples;
import finallyTagless.impl.EvalImpl;
import finallyTagless.impl.ViewImpl;

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

}
