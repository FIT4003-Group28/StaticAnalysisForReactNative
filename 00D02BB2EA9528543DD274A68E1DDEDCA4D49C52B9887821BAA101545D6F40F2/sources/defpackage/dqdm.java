package defpackage;
/* compiled from: PG */
/* renamed from: dqdm  reason: default package */
/* loaded from: classes6.dex */
public final class dqdm extends dsqw<dqdm, dqdl> implements dssk {
    public static final dqdm b;
    private static volatile dssr<dqdm> d;
    public dqdk a;
    private int c;

    static {
        dqdm dqdmVar = new dqdm();
        b = dqdmVar;
        dsqw.cc(dqdm.class, dqdmVar);
    }

    private dqdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqdm();
            }
            if (i2 == 4) {
                return new dqdl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqdm.class) {
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
