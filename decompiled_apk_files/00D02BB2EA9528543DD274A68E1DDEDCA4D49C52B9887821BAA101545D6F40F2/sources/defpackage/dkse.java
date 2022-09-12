package defpackage;
/* compiled from: PG */
/* renamed from: dkse  reason: default package */
/* loaded from: classes.dex */
public final class dkse extends dsqw<dkse, dksd> implements dssk {
    public static final dkse b;
    private static volatile dssr<dkse> d;
    public boolean a;
    private int c;

    static {
        dkse dkseVar = new dkse();
        b = dkseVar;
        dsqw.cc(dkse.class, dkseVar);
    }

    private dkse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkse();
            }
            if (i2 == 4) {
                return new dksd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkse> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkse.class) {
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
