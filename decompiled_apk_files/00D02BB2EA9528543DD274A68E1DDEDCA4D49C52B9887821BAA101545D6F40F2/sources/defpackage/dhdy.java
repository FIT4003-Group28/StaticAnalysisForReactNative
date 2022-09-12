package defpackage;
/* compiled from: PG */
/* renamed from: dhdy  reason: default package */
/* loaded from: classes6.dex */
public final class dhdy extends dsqw<dhdy, dhdx> implements dssk {
    public static final dhdy b;
    private static volatile dssr<dhdy> c;
    public dsrj<dhfi> a = dssu.b;

    static {
        dhdy dhdyVar = new dhdy();
        b = dhdyVar;
        dsqw.cc(dhdy.class, dhdyVar);
    }

    private dhdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dhfi.class});
            }
            if (i2 == 3) {
                return new dhdy();
            }
            if (i2 == 4) {
                return new dhdx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhdy.class) {
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
