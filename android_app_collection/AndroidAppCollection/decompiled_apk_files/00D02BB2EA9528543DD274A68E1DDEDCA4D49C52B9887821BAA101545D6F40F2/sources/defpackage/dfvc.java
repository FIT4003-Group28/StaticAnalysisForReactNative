package defpackage;
/* compiled from: PG */
/* renamed from: dfvc  reason: default package */
/* loaded from: classes6.dex */
public final class dfvc extends dsqw<dfvc, dfvb> implements dssk {
    public static final dfvc a;
    private static volatile dssr<dfvc> b;

    static {
        dfvc dfvcVar = new dfvc();
        a = dfvcVar;
        dsqw.cc(dfvc.class, dfvcVar);
    }

    private dfvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfvc();
            }
            if (i2 == 4) {
                return new dfvb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfvc.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
