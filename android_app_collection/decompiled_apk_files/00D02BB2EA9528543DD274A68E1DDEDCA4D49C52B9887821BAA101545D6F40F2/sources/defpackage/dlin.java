package defpackage;
/* compiled from: PG */
/* renamed from: dlin  reason: default package */
/* loaded from: classes6.dex */
public final class dlin extends dsqw<dlin, dlim> implements dssk {
    public static final dlin b;
    private static volatile dssr<dlin> d;
    public dlil a;
    private int c;

    static {
        dlin dlinVar = new dlin();
        b = dlinVar;
        dsqw.cc(dlin.class, dlinVar);
    }

    private dlin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlin();
            }
            if (i2 == 4) {
                return new dlim();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlin> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlin.class) {
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
