package defpackage;
/* compiled from: PG */
/* renamed from: dnxx  reason: default package */
/* loaded from: classes6.dex */
public final class dnxx extends dsqw<dnxx, dnxs> implements dssk {
    public static final dnxx c;
    private static volatile dssr<dnxx> d;
    public int a;
    public dnxw b;

    static {
        dnxx dnxxVar = new dnxx();
        c = dnxxVar;
        dsqw.cc(dnxx.class, dnxxVar);
    }

    private dnxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnxx();
            }
            if (i2 == 4) {
                return new dnxs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnxx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
