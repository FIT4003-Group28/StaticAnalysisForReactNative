package defpackage;
/* compiled from: PG */
/* renamed from: done  reason: default package */
/* loaded from: classes6.dex */
public final class done extends dsqw<done, domz> implements dssk {
    public static final done e;
    private static volatile dssr<done> f;
    public int a;
    public int b;
    public int c;
    public dsrj<dond> d = dssu.b;

    static {
        done doneVar = new done();
        e = doneVar;
        dsqw.cc(done.class, doneVar);
    }

    private done() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", domy.c(), "c", donb.c(), "d", dond.class});
            }
            if (i2 == 3) {
                return new done();
            }
            if (i2 == 4) {
                return new domz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<done> dssrVar = f;
            if (dssrVar == null) {
                synchronized (done.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
