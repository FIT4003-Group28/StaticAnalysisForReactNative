package defpackage;
/* compiled from: PG */
/* renamed from: dlog  reason: default package */
/* loaded from: classes6.dex */
public final class dlog extends dsqw<dlog, dlof> implements dssk {
    public static final dlog e;
    private static volatile dssr<dlog> f;
    public int a;
    public int b = 0;
    public Object c;
    public dloc d;

    static {
        dlog dlogVar = new dlog();
        e = dlogVar;
        dsqw.cc(dlog.class, dlogVar);
    }

    private dlog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဉ\u0001", new Object[]{"c", "b", "a", dvzn.class, "d"});
            }
            if (i2 == 3) {
                return new dlog();
            }
            if (i2 == 4) {
                return new dlof();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlog> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlog.class) {
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
