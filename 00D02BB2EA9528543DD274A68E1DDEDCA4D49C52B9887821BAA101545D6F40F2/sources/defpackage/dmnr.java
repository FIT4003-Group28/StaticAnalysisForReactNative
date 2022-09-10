package defpackage;
/* compiled from: PG */
/* renamed from: dmnr  reason: default package */
/* loaded from: classes.dex */
public final class dmnr extends dsqw<dmnr, dmnq> implements dssk {
    public static final dmnr f;
    private static volatile dssr<dmnr> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public dsrf e = dsqz.b;

    static {
        dmnr dmnrVar = new dmnr();
        f = dmnrVar;
        dsqw.cc(dmnr.class, dmnrVar);
    }

    private dmnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u0016", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmnr();
            }
            if (i2 == 4) {
                return new dmnq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmnr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmnr.class) {
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
