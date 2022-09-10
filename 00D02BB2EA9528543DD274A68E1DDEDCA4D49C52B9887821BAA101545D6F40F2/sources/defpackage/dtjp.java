package defpackage;
/* compiled from: PG */
/* renamed from: dtjp  reason: default package */
/* loaded from: classes6.dex */
public final class dtjp extends dsqw<dtjp, dtjm> implements dssk {
    public static final dtjp h;
    private static volatile dssr<dtjp> i;
    public int a;
    public int c;
    public int d;
    public int e;
    public int b = 1;
    public int f = 1;
    public dsrf g = dsqz.b;

    static {
        dtjp dtjpVar = new dtjp();
        h = dtjpVar;
        dsqw.cc(dtjp.class, dtjpVar);
    }

    private dtjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001င\u0001\u0002င\u0002\u0003င\u0003\bဌ\u0000\tဌ\u0004\n\u0016", new Object[]{"a", "c", "d", "e", "b", dtjn.a, "f", dtjo.a, "g"});
            }
            if (i3 == 3) {
                return new dtjp();
            }
            if (i3 == 4) {
                return new dtjm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtjp> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtjp.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
