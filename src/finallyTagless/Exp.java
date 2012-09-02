package finallyTagless;

public interface Exp<R> {

    R lit(int n);

    R neg(R r);

    R add(R r0, R r1);
}
