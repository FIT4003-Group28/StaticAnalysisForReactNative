package defpackage;
/* compiled from: PG */
/* renamed from: dncc  reason: default package */
/* loaded from: classes6.dex */
public final class dncc extends dsqw<dncc, dnbz> implements dssk {
    public static final dncc b;
    private static volatile dssr<dncc> c;
    public dsrj<dncb> a = dssu.b;

    static {
        dncc dnccVar = new dncc();
        b = dnccVar;
        dsqw.cc(dncc.class, dnccVar);
    }

    private dncc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dncb.class});
            }
            if (i2 == 3) {
                return new dncc();
            }
            if (i2 == 4) {
                return new dnbz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dncc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dncc.class) {
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
