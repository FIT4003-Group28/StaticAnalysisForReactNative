package defpackage;
/* compiled from: PG */
/* renamed from: dksu  reason: default package */
/* loaded from: classes.dex */
public final class dksu extends dsqw<dksu, dkst> implements dssk {
    public static final dksu b;
    private static volatile dssr<dksu> d;
    public int a;
    private int c;

    static {
        dksu dksuVar = new dksu();
        b = dksuVar;
        dsqw.cc(dksu.class, dksuVar);
    }

    private dksu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dkss.c()});
            }
            if (i2 == 3) {
                return new dksu();
            }
            if (i2 == 4) {
                return new dkst();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dksu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
