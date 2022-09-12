package defpackage;
/* compiled from: PG */
/* renamed from: dggm  reason: default package */
/* loaded from: classes6.dex */
public final class dggm extends dsqw<dggm, dggl> implements dssk {
    public static final dggm b;
    private static volatile dssr<dggm> d;
    public dghm a;
    private int c;

    static {
        dggm dggmVar = new dggm();
        b = dggmVar;
        dsqw.cc(dggm.class, dggmVar);
    }

    private dggm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dggm();
            }
            if (i2 == 4) {
                return new dggl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dggm.class) {
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
