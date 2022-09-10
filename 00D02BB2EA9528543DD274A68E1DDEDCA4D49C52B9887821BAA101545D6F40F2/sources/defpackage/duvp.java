package defpackage;
/* compiled from: PG */
/* renamed from: duvp  reason: default package */
/* loaded from: classes6.dex */
public final class duvp extends dsqw<duvp, duvo> implements dssk {
    public static final duvp b;
    private static volatile dssr<duvp> d;
    public dkdg a;
    private int c;

    static {
        duvp duvpVar = new duvp();
        b = duvpVar;
        dsqw.cc(duvp.class, duvpVar);
    }

    private duvp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new duvp();
            }
            if (i2 == 4) {
                return new duvo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duvp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duvp.class) {
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
