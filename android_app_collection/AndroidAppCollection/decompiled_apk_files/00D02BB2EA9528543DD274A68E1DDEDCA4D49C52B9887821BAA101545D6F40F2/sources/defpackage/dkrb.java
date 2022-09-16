package defpackage;
/* compiled from: PG */
/* renamed from: dkrb  reason: default package */
/* loaded from: classes.dex */
public final class dkrb extends dsqw<dkrb, dkra> implements dssk {
    public static final dkrb b;
    private static volatile dssr<dkrb> d;
    public dkhd a;
    private int c;

    static {
        dkrb dkrbVar = new dkrb();
        b = dkrbVar;
        dsqw.cc(dkrb.class, dkrbVar);
    }

    private dkrb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkrb();
            }
            if (i2 == 4) {
                return new dkra();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkrb.class) {
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
