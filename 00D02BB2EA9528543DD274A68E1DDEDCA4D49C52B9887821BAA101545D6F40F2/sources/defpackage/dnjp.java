package defpackage;
/* compiled from: PG */
/* renamed from: dnjp  reason: default package */
/* loaded from: classes6.dex */
public final class dnjp extends dsqw<dnjp, dnjo> implements dssk {
    public static final dnjp b;
    private static volatile dssr<dnjp> d;
    public dnvs a;
    private int c;

    static {
        dnjp dnjpVar = new dnjp();
        b = dnjpVar;
        dsqw.cc(dnjp.class, dnjpVar);
    }

    private dnjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnjp();
            }
            if (i2 == 4) {
                return new dnjo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnjp.class) {
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
