package defpackage;
/* compiled from: PG */
/* renamed from: dnay  reason: default package */
/* loaded from: classes.dex */
public final class dnay extends dsqw<dnay, dnav> implements dssk {
    public static final dnay c;
    private static volatile dssr<dnay> e;
    public int a;
    public dniu b;
    private dnax d;

    static {
        dnay dnayVar = new dnay();
        c = dnayVar;
        dsqw.cc(dnay.class, dnayVar);
    }

    private dnay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0002", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dnay();
            }
            if (i2 == 4) {
                return new dnav();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnay> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnay.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
