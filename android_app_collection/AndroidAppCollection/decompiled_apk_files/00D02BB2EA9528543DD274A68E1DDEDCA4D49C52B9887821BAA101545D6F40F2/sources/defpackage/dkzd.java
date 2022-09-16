package defpackage;
/* compiled from: PG */
/* renamed from: dkzd  reason: default package */
/* loaded from: classes6.dex */
public final class dkzd extends dsqw<dkzd, dkza> implements dssk {
    public static final dkzd b;
    private static volatile dssr<dkzd> d;
    public int a;
    private int c;

    static {
        dkzd dkzdVar = new dkzd();
        b = dkzdVar;
        dsqw.cc(dkzd.class, dkzdVar);
    }

    private dkzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dkzc.c()});
            }
            if (i2 == 3) {
                return new dkzd();
            }
            if (i2 == 4) {
                return new dkza();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkzd.class) {
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
