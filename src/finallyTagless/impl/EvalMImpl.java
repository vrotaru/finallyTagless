package finallyTagless.impl;

import finallyTagless.ExpM;

public class EvalMImpl extends EvalImpl implements ExpM<Integer> {

    @Override
    public Integer mul(Integer r0, Integer r1) {
        return r0 * r1;
    }

}
