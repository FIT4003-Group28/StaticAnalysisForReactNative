package defpackage;
/* compiled from: PG */
/* renamed from: dkpv  reason: default package */
/* loaded from: classes.dex */
public final class dkpv extends dsqw<dkpv, dkpu> implements dssk {
    public static final dkpv b;
    private static volatile dssr<dkpv> d;
    public int a;
    private int c;

    static {
        dkpv dkpvVar = new dkpv();
        b = dkpvVar;
        dsqw.cc(dkpv.class, dkpvVar);
    }

    private dkpv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkpv();
            }
            if (i2 == 4) {
                return new dkpu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkpv.class) {
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
