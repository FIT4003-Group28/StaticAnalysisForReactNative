package defpackage;
/* compiled from: PG */
/* renamed from: eawr  reason: default package */
/* loaded from: classes6.dex */
public final class eawr extends dsqw<eawr, eawq> implements dssk {
    public static final eawr e;
    private static volatile dssr<eawr> f;
    public int a;
    public int b;
    public long c;
    public long d;

    static {
        eawr eawrVar = new eawr();
        e = eawrVar;
        dsqw.cc(eawr.class, eawrVar);
    }

    private eawr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", eaxj.a, "c", "d"});
            }
            if (i2 == 3) {
                return new eawr();
            }
            if (i2 == 4) {
                return new eawq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eawr.class) {
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
