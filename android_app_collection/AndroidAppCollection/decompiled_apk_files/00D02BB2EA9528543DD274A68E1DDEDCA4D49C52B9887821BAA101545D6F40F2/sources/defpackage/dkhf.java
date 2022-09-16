package defpackage;
/* compiled from: PG */
/* renamed from: dkhf  reason: default package */
/* loaded from: classes.dex */
public final class dkhf extends dsqw<dkhf, dkhe> implements dssk {
    public static final dkhf f;
    private static volatile dssr<dkhf> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dkhf dkhfVar = new dkhf();
        f = dkhfVar;
        dsqw.cc(dkhf.class, dkhfVar);
    }

    private dkhf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkhf();
            }
            if (i2 == 4) {
                return new dkhe();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkhf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkhf.class) {
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
