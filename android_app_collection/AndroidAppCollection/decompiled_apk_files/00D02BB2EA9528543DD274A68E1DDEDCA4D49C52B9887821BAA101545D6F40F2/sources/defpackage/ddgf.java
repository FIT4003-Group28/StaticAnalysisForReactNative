package defpackage;
/* compiled from: PG */
/* renamed from: ddgf  reason: default package */
/* loaded from: classes5.dex */
public final class ddgf extends dsqw<ddgf, ddge> implements dssk {
    public static final ddgf e;
    private static volatile dssr<ddgf> f;
    public int a;
    public int c;
    public int b = -1;
    public dsrf d = dsqz.b;

    static {
        ddgf ddgfVar = new ddgf();
        e = ddgfVar;
        dsqw.cc(ddgf.class, ddgfVar);
    }

    private ddgf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဋ\u0001\u0003\u001d", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddgf();
            }
            if (i2 == 4) {
                return new ddge();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddgf.class) {
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
