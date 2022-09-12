package defpackage;
/* compiled from: PG */
/* renamed from: dnzc  reason: default package */
/* loaded from: classes6.dex */
public final class dnzc extends dsqw<dnzc, dnyz> implements dssk {
    public static final dnzc b;
    private static volatile dssr<dnzc> c;
    public dsrj<dnzb> a = dssu.b;

    static {
        dnzc dnzcVar = new dnzc();
        b = dnzcVar;
        dsqw.cc(dnzc.class, dnzcVar);
    }

    private dnzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnzb.class});
            }
            if (i2 == 3) {
                return new dnzc();
            }
            if (i2 == 4) {
                return new dnyz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnzc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
