package defpackage;
/* compiled from: PG */
/* renamed from: drus  reason: default package */
/* loaded from: classes6.dex */
public final class drus extends dsqw<drus, drup> implements dssk {
    public static final drus f;
    private static volatile dssr<drus> g;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        drus drusVar = new drus();
        f = drusVar;
        dsqw.cc(drus.class, drusVar);
    }

    private drus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", druq.a, "d", drur.a, "e", drur.a});
            }
            if (i2 == 3) {
                return new drus();
            }
            if (i2 == 4) {
                return new drup();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drus> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drus.class) {
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
