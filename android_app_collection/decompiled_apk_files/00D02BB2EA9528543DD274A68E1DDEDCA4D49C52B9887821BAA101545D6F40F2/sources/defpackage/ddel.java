package defpackage;
/* compiled from: PG */
/* renamed from: ddel  reason: default package */
/* loaded from: classes.dex */
public final class ddel extends dsqw<ddel, ddej> implements dssk {
    public static final ddel f;
    private static volatile dssr<ddel> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ddel ddelVar = new ddel();
        f = ddelVar;
        dsqw.cc(ddel.class, ddelVar);
    }

    private ddel() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", ddek.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddel();
            }
            if (i2 == 4) {
                return new ddej();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddel> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddel.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
