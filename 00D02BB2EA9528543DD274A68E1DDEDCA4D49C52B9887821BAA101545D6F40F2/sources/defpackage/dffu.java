package defpackage;
/* compiled from: PG */
/* renamed from: dffu  reason: default package */
/* loaded from: classes6.dex */
public final class dffu extends dsqw<dffu, dffr> implements dssk {
    public static final dffu b;
    private static volatile dssr<dffu> c;
    public dsrj<dfft> a = dssu.b;

    static {
        dffu dffuVar = new dffu();
        b = dffuVar;
        dsqw.cc(dffu.class, dffuVar);
    }

    private dffu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dfft.class});
            }
            if (i2 == 3) {
                return new dffu();
            }
            if (i2 == 4) {
                return new dffr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dffu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dffu.class) {
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
