package defpackage;
/* compiled from: PG */
/* renamed from: dlln  reason: default package */
/* loaded from: classes6.dex */
public final class dlln extends dsqw<dlln, dllk> implements dssk {
    public static final dlln g;
    private static volatile dssr<dlln> h;
    public int a;
    public dvzn b;
    public dllh c;
    public boolean d;
    public boolean e;
    public int f = 1;

    static {
        dlln dllnVar = new dlln();
        g = dllnVar;
        dsqw.cc(dlln.class, dllnVar);
    }

    private dlln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", dlll.a});
            }
            if (i2 == 3) {
                return new dlln();
            }
            if (i2 == 4) {
                return new dllk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlln> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlln.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
