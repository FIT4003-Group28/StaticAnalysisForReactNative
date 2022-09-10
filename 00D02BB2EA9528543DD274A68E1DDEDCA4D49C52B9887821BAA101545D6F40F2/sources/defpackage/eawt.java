package defpackage;
/* compiled from: PG */
/* renamed from: eawt  reason: default package */
/* loaded from: classes6.dex */
public final class eawt extends dsqw<eawt, eaws> implements dssk {
    public static final eawt d;
    private static volatile dssr<eawt> e;
    public int a;
    public long b;
    public long c;

    static {
        eawt eawtVar = new eawt();
        d = eawtVar;
        dsqw.cc(eawt.class, eawtVar);
    }

    private eawt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new eawt();
            }
            if (i2 == 4) {
                return new eaws();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eawt.class) {
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
