package finallyTagless.impl;

import finallyTagless.Exp;

public class EvalImpl implements Exp<Integer> {

    @Override
    public Integer lit(int n) {
        return n;
    }

    @Override
    public Integer neg(Integer r) {
        return -r;
    }

    @Override
    public Integer add(Integer r0, Integer r1) {
        return r0 + r1;
    }

}
