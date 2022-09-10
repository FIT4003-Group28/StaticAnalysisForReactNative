package defpackage;
/* compiled from: PG */
/* renamed from: eaxr  reason: default package */
/* loaded from: classes6.dex */
public final class eaxr extends dsqw<eaxr, eaxq> implements dssk {
    public static final eaxr f;
    private static volatile dssr<eaxr> g;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;

    static {
        eaxr eaxrVar = new eaxr();
        f = eaxrVar;
        dsqw.cc(eaxr.class, eaxrVar);
    }

    private eaxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new eaxr();
            }
            if (i2 == 4) {
                return new eaxq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eaxr.class) {
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
