package defpackage;
/* compiled from: PG */
/* renamed from: dgdy  reason: default package */
/* loaded from: classes6.dex */
public final class dgdy extends dsqw<dgdy, dgdx> implements dssk {
    public static final dgdy b;
    private static volatile dssr<dgdy> c;
    public dsrj<dggq> a = dssu.b;

    static {
        dgdy dgdyVar = new dgdy();
        b = dgdyVar;
        dsqw.cc(dgdy.class, dgdyVar);
    }

    private dgdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", dggq.class});
            }
            if (i2 == 3) {
                return new dgdy();
            }
            if (i2 == 4) {
                return new dgdx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgdy.class) {
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
