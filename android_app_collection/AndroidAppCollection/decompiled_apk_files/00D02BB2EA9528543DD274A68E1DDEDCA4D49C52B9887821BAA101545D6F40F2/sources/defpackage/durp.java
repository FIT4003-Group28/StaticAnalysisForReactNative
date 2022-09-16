package defpackage;
/* compiled from: PG */
/* renamed from: durp  reason: default package */
/* loaded from: classes6.dex */
public final class durp extends dsqw<durp, durm> implements dssk {
    public static final durp b;
    private static volatile dssr<durp> d;
    public int a;
    private int c;

    static {
        durp durpVar = new durp();
        b = durpVar;
        dsqw.cc(durp.class, durpVar);
    }

    private durp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", durn.a});
            }
            if (i2 == 3) {
                return new durp();
            }
            if (i2 == 4) {
                return new durm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (durp.class) {
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
