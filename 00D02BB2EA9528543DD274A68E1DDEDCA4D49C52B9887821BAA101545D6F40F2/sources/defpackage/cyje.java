package defpackage;
/* compiled from: PG */
/* renamed from: cyje  reason: default package */
/* loaded from: classes5.dex */
public final class cyje extends dsqw<cyje, cyjb> implements dssk {
    public static final cyje b;
    private static volatile dssr<cyje> c;
    public cyjd a;

    static {
        cyje cyjeVar = new cyje();
        b = cyjeVar;
        dsqw.cc(cyje.class, cyjeVar);
    }

    private cyje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cyje();
            }
            if (i2 == 4) {
                return new cyjb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyje> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cyje.class) {
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
