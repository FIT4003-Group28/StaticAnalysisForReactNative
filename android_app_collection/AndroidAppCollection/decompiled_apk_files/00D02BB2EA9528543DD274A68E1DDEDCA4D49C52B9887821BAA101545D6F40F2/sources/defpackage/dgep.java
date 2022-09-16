package defpackage;
/* compiled from: PG */
/* renamed from: dgep  reason: default package */
/* loaded from: classes6.dex */
public final class dgep extends dsqw<dgep, dgei> implements dssk {
    public static final dgep f;
    private static volatile dssr<dgep> g;
    public int a;
    public Object c;
    public int d;
    public int b = 0;
    public String e = "";

    static {
        dgep dgepVar = new dgep();
        f = dgepVar;
        dsqw.cc(dgep.class, dgepVar);
    }

    private dgep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", dgeg.a, "e", dgek.class, dgeo.class, dgem.class});
            }
            if (i2 == 3) {
                return new dgep();
            }
            if (i2 == 4) {
                return new dgei();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgep> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgep.class) {
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
