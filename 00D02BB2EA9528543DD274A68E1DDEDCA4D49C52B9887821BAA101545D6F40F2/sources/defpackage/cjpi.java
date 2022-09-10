package defpackage;
/* compiled from: PG */
/* renamed from: cjpi  reason: default package */
/* loaded from: classes4.dex */
public final class cjpi extends dsqw<cjpi, cjph> implements dssk {
    public static final cjpi c;
    private static volatile dssr<cjpi> d;
    public int a;
    public apzv b;

    static {
        cjpi cjpiVar = new cjpi();
        c = cjpiVar;
        dsqw.cc(cjpi.class, cjpiVar);
    }

    private cjpi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cjpi();
            }
            if (i2 == 4) {
                return new cjph();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cjpi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cjpi.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
