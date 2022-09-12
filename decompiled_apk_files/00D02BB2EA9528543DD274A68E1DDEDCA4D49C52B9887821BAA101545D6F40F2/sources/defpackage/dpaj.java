package defpackage;
/* compiled from: PG */
/* renamed from: dpaj  reason: default package */
/* loaded from: classes6.dex */
public final class dpaj extends dsqw<dpaj, dpai> implements dssk {
    public static final dpaj d;
    private static volatile dssr<dpaj> e;
    public int a;
    public dpjx b;
    public boolean c;

    static {
        dpaj dpajVar = new dpaj();
        d = dpajVar;
        dsqw.cc(dpaj.class, dpajVar);
    }

    private dpaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpaj();
            }
            if (i2 == 4) {
                return new dpai();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpaj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpaj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
