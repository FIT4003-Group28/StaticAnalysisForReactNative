package defpackage;
/* compiled from: PG */
/* renamed from: dnlc  reason: default package */
/* loaded from: classes6.dex */
public final class dnlc extends dsqw<dnlc, dnla> implements dssk {
    public static final dnlc c;
    private static volatile dssr<dnlc> d;
    public int a;
    public int b;

    static {
        dnlc dnlcVar = new dnlc();
        c = dnlcVar;
        dsqw.cc(dnlc.class, dnlcVar);
    }

    private dnlc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dnlb.a});
            }
            if (i2 == 3) {
                return new dnlc();
            }
            if (i2 == 4) {
                return new dnla();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnlc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
