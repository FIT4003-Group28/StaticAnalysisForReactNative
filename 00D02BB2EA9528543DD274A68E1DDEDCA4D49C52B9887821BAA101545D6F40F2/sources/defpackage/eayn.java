package defpackage;
/* compiled from: PG */
/* renamed from: eayn  reason: default package */
/* loaded from: classes6.dex */
public final class eayn extends dsqw<eayn, eaym> implements dssk {
    public static final eayn f;
    private static volatile dssr<eayn> g;
    public int a;
    public eaxp b;
    public int c;
    public eaxv d;
    public eaxn e;

    static {
        eayn eaynVar = new eayn();
        f = eaynVar;
        dsqw.cc(eayn.class, eaynVar);
    }

    private eayn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0004\u0006ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new eayn();
            }
            if (i2 == 4) {
                return new eaym();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eayn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
