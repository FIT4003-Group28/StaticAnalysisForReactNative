package defpackage;
/* compiled from: PG */
/* renamed from: dvmb  reason: default package */
/* loaded from: classes.dex */
public final class dvmb extends dsqw<dvmb, dvma> implements dssk {
    public static final dvmb f;
    private static volatile dssr<dvmb> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dvmb dvmbVar = new dvmb();
        f = dvmbVar;
        dsqw.cc(dvmb.class, dvmbVar);
    }

    private dvmb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\bဇ\u0007", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dvmb();
            }
            if (i2 == 4) {
                return new dvma();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvmb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvmb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
