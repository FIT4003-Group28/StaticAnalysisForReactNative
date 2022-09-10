package defpackage;
/* compiled from: PG */
/* renamed from: cmuv  reason: default package */
/* loaded from: classes5.dex */
public final class cmuv extends dsqw<cmuv, cmuo> implements dssk {
    public static final cmuv d;
    private static volatile dssr<cmuv> f;
    public int a;
    public dsrj<cmul> b = dssu.b;
    public dsrj<cmus> c = dssu.b;
    private int e;

    static {
        cmuv cmuvVar = new cmuv();
        d = cmuvVar;
        dsqw.cc(cmuv.class, cmuvVar);
    }

    private cmuv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0004\u001b", new Object[]{"e", "a", cmut.a, "b", cmul.class, "c", cmus.class});
            }
            if (i2 == 3) {
                return new cmuv();
            }
            if (i2 == 4) {
                return new cmuo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cmuv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cmuv.class) {
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
