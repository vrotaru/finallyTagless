package finallyTagless;

public class Samples {

    public static <R> R one(Exp<R> exp) {
        R _1 = exp.lit(1);
        R _2 = exp.lit(2);
        R _8 = exp.lit(8);

        R e0 = exp.add(_1, _2);
        R e1 = exp.neg(e0);
        R e2 = exp.add(_8, e1);

        return e2;

    }

    public static <R> R two(Exp<R> exp) {
        R e0 = one(exp);
        R e1 = exp.add(exp.lit(10), e0);

        return e1;
    }

    // public <R> R sample2(IExpM<R> exp) {
    // R lit_5 = exp.lit(5);
    // R e0 = sample(exp);
    // R e1 = exp.mul(lit_5, e0);
    //
    // return e1;
    // }
}
