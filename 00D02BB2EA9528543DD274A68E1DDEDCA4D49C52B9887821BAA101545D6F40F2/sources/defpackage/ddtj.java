package defpackage;
/* compiled from: PG */
/* renamed from: ddtj  reason: default package */
/* loaded from: classes6.dex */
public final class ddtj extends dsqw<ddtj, ddti> implements dssk {
    public static final ddtj e;
    private static volatile dssr<ddtj> f;
    public int a;
    public float b;
    public float c;
    public float d;

    static {
        ddtj ddtjVar = new ddtj();
        e = ddtjVar;
        dsqw.cc(ddtj.class, ddtjVar);
    }

    private ddtj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddtj();
            }
            if (i2 == 4) {
                return new ddti();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddtj.class) {
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
