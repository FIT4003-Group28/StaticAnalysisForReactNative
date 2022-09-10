package defpackage;
/* compiled from: PG */
/* renamed from: ddih  reason: default package */
/* loaded from: classes5.dex */
public final class ddih extends dsqw<ddih, ddig> implements dssk {
    public static final ddih b;
    private static volatile dssr<ddih> c;
    public dsrj<ddif> a = dssu.b;

    static {
        ddih ddihVar = new ddih();
        b = ddihVar;
        dsqw.cc(ddih.class, ddihVar);
    }

    private ddih() {
        dsrx dsrxVar = dsrx.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", ddif.class});
            }
            if (i2 == 3) {
                return new ddih();
            }
            if (i2 == 4) {
                return new ddig();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddih> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddih.class) {
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
