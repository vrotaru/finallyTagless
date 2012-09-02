package finallyTagless.impl;

import finallyTagless.ExpM;

public class ViewMImpl extends ViewImpl implements ExpM<String> {

    @Override
    public String mul(String r0, String r1) {
        return "(" + r0 + " * " + r1 + ")";
    }

}
