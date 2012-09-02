package finallyTagless.impl;

import finallyTagless.Exp;

public class ViewImpl implements Exp<String> {

    @Override
    public String lit(int n) {
        return Integer.toString(n);
    }

    @Override
    public String neg(String r) {
        return "(-" + r + ")";
    }

    @Override
    public String add(String r0, String r1) {
        return "(" + r0 + " + " + r1 + ")";
    }

}
