package defpackage;
/* compiled from: PG */
/* renamed from: dnks  reason: default package */
/* loaded from: classes6.dex */
public final class dnks extends dsqw<dnks, dnkp> implements dssk {
    public static final dnks b;
    private static volatile dssr<dnks> c;
    public dsrj<dnkr> a = dssu.b;

    static {
        dnks dnksVar = new dnks();
        b = dnksVar;
        dsqw.cc(dnks.class, dnksVar);
    }

    private dnks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnkr.class});
            }
            if (i2 == 3) {
                return new dnks();
            }
            if (i2 == 4) {
                return new dnkp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnks> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnks.class) {
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
