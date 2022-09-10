package defpackage;
/* compiled from: PG */
/* renamed from: dgba  reason: default package */
/* loaded from: classes6.dex */
public final class dgba extends dsqw<dgba, dgaz> implements dssk {
    public static final dgba b;
    private static volatile dssr<dgba> c;
    public dsrj<dgay> a = dssu.b;

    static {
        dgba dgbaVar = new dgba();
        b = dgbaVar;
        dsqw.cc(dgba.class, dgbaVar);
    }

    private dgba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgay.class});
            }
            if (i2 == 3) {
                return new dgba();
            }
            if (i2 == 4) {
                return new dgaz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgba> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgba.class) {
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
