package defpackage;
/* compiled from: PG */
/* renamed from: dkgd  reason: default package */
/* loaded from: classes6.dex */
public final class dkgd extends dsqw<dkgd, dkga> implements dssk {
    public static final dkgd b;
    private static volatile dssr<dkgd> d;
    public int a;
    private int c;

    static {
        dkgd dkgdVar = new dkgd();
        b = dkgdVar;
        dsqw.cc(dkgd.class, dkgdVar);
    }

    private dkgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dkgc.c()});
            }
            if (i2 == 3) {
                return new dkgd();
            }
            if (i2 == 4) {
                return new dkga();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkgd.class) {
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
