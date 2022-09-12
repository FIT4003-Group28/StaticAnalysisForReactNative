package defpackage;
/* compiled from: PG */
/* renamed from: eaar  reason: default package */
/* loaded from: classes.dex */
public final class eaar extends dsqw<eaar, eaap> implements dssk {
    public static final eaar n;
    private static volatile dssr<eaar> o;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public eaao k;
    public eaao l;
    public dssd<Integer, Long> m = dssd.b;

    static {
        eaar eaarVar = new eaar();
        n = eaarVar;
        dsqw.cc(eaar.class, eaarVar);
    }

    private eaar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0010\f\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\tဂ\u0007\nဂ\b\u000bဇ\t\fဉ\n\rဉ\u000b\u000eဂ\u0001\u000fဂ\u0002\u00102", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "k", "l", "c", "d", "m", eaaq.a});
            }
            if (i2 == 3) {
                return new eaar();
            }
            if (i2 == 4) {
                return new eaap();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaar> dssrVar = o;
            if (dssrVar == null) {
                synchronized (eaar.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
