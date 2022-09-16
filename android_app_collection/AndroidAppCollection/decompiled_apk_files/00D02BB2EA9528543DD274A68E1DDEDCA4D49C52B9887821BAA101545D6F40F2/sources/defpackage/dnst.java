package defpackage;
/* compiled from: PG */
/* renamed from: dnst  reason: default package */
/* loaded from: classes6.dex */
public final class dnst extends dsqw<dnst, dnss> implements dssk {
    public static final dnst f;
    private static volatile dssr<dnst> g;
    public int a;
    public dnsr b;
    public long c;
    public dnoh d;
    public dsrj<dnsr> e = dssu.b;

    static {
        dnst dnstVar = new dnst();
        f = dnstVar;
        dsqw.cc(dnst.class, dnstVar);
    }

    private dnst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", dnsr.class});
            }
            if (i2 == 3) {
                return new dnst();
            }
            if (i2 == 4) {
                return new dnss();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnst> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnst.class) {
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
