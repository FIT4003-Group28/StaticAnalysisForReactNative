package defpackage;
/* compiled from: PG */
/* renamed from: dtzz  reason: default package */
/* loaded from: classes6.dex */
public final class dtzz extends dsqw<dtzz, dtzv> implements dssk {
    public static final dsrg<Integer, dtzy> d = new dtzu();
    public static final dtzz e;
    private static volatile dssr<dtzz> f;
    public dtzx a;
    public int b;
    public dsrf c = dsqz.b;

    static {
        dtzz dtzzVar = new dtzz();
        e = dtzzVar;
        dsqw.cc(dtzz.class, dtzzVar);
    }

    private dtzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\f\u0004,", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtzz();
            }
            if (i2 == 4) {
                return new dtzv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtzz.class) {
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
