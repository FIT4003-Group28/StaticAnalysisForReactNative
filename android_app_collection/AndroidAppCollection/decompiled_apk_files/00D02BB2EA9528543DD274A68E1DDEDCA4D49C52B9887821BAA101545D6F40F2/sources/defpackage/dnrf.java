package defpackage;
/* compiled from: PG */
/* renamed from: dnrf  reason: default package */
/* loaded from: classes6.dex */
public final class dnrf extends dsqw<dnrf, dnre> implements dssk {
    public static final dnrf d;
    private static volatile dssr<dnrf> e;
    public int a;
    public dngs b;
    public dork c;

    static {
        dnrf dnrfVar = new dnrf();
        d = dnrfVar;
        dsqw.cc(dnrf.class, dnrfVar);
    }

    private dnrf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnrf();
            }
            if (i2 == 4) {
                return new dnre();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnrf.class) {
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
