package defpackage;
/* compiled from: PG */
/* renamed from: eawd  reason: default package */
/* loaded from: classes6.dex */
public final class eawd extends dsqw<eawd, eawc> implements dssk {
    public static final eawd e;
    private static volatile dssr<eawd> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        eawd eawdVar = new eawd();
        e = eawdVar;
        dsqw.cc(eawd.class, eawdVar);
    }

    private eawd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0004င\u0003", new Object[]{"a", "b", eawz.a, "c", "d"});
            }
            if (i2 == 3) {
                return new eawd();
            }
            if (i2 == 4) {
                return new eawc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eawd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
