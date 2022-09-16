package defpackage;
/* compiled from: PG */
/* renamed from: dkgv  reason: default package */
/* loaded from: classes6.dex */
public final class dkgv extends dsqw<dkgv, dkgu> implements dssk {
    public static final dkgv d;
    private static volatile dssr<dkgv> f;
    public float a = 45.0f;
    public boolean b = true;
    public boolean c;
    private int e;

    static {
        dkgv dkgvVar = new dkgv();
        d = dkgvVar;
        dsqw.cc(dkgv.class, dkgvVar);
    }

    private dkgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkgv();
            }
            if (i2 == 4) {
                return new dkgu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
