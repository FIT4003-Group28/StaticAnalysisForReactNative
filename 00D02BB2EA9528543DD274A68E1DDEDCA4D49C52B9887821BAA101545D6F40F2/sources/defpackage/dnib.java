package defpackage;
/* compiled from: PG */
/* renamed from: dnib  reason: default package */
/* loaded from: classes6.dex */
public final class dnib extends dsqw<dnib, dnia> implements dssk {
    public static final dnib e;
    private static volatile dssr<dnib> f;
    public int a;
    public dniu b;
    public String c = "";
    public int d;

    static {
        dnib dnibVar = new dnib();
        e = dnibVar;
        dsqw.cc(dnib.class, dnibVar);
    }

    private dnib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnib();
            }
            if (i2 == 4) {
                return new dnia();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnib> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnib.class) {
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
