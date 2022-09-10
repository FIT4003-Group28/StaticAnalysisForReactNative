package defpackage;
/* compiled from: PG */
/* renamed from: ddil  reason: default package */
/* loaded from: classes.dex */
public final class ddil extends dsqw<ddil, ddik> implements dssk {
    public static final ddil e;
    private static volatile dssr<ddil> f;
    public int a;
    public int b;
    public int c;
    public boolean d;

    static {
        ddil ddilVar = new ddil();
        e = ddilVar;
        dsqw.cc(ddil.class, ddilVar);
    }

    private ddil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0000\u0001ဌ\u0000\rင\n\u0011ဇ\r", new Object[]{"a", "b", dpof.a, "c", "d"});
            }
            if (i2 == 3) {
                return new ddil();
            }
            if (i2 == 4) {
                return new ddik();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddil> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddil.class) {
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
