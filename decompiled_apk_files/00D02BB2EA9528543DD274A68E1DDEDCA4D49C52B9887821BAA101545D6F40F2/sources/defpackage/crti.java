package defpackage;
/* compiled from: PG */
/* renamed from: crti  reason: default package */
/* loaded from: classes5.dex */
public final class crti extends dsqw<crti, crth> implements dssk {
    public static final crti g;
    private static volatile dssr<crti> h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public dgpy e;
    public int f;

    static {
        crti crtiVar = new crti();
        g = crtiVar;
        dsqw.cc(crti.class, crtiVar);
    }

    private crti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဌ\u0002\u0007ဌ\u0004\bဉ\u0003", new Object[]{"a", "b", "c", "d", dgpr.a, "f", dfqp.c(), "e"});
            }
            if (i2 == 3) {
                return new crti();
            }
            if (i2 == 4) {
                return new crth();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crti> dssrVar = h;
            if (dssrVar == null) {
                synchronized (crti.class) {
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
