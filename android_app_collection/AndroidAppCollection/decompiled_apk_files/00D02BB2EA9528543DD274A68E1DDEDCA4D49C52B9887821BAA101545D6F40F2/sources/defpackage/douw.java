package defpackage;
/* compiled from: PG */
/* renamed from: douw  reason: default package */
/* loaded from: classes6.dex */
public final class douw extends dsqw<douw, douv> implements dssk {
    public static final douw b;
    private static volatile dssr<douw> d;
    public int a;
    private int c;

    static {
        douw douwVar = new douw();
        b = douwVar;
        dsqw.cc(douw.class, douwVar);
    }

    private douw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", drsm.c()});
            }
            if (i2 == 3) {
                return new douw();
            }
            if (i2 == 4) {
                return new douv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<douw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (douw.class) {
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
