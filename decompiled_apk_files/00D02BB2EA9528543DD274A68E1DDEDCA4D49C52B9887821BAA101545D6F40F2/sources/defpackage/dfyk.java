package defpackage;
/* compiled from: PG */
/* renamed from: dfyk  reason: default package */
/* loaded from: classes6.dex */
public final class dfyk extends dsqw<dfyk, dfyj> implements dssk {
    public static final dfyk b;
    private static volatile dssr<dfyk> c;
    public dsrj<dfye> a = dssu.b;

    static {
        dfyk dfykVar = new dfyk();
        b = dfykVar;
        dsqw.cc(dfyk.class, dfykVar);
    }

    private dfyk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dfye.class});
            }
            if (i2 == 3) {
                return new dfyk();
            }
            if (i2 == 4) {
                return new dfyj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfyk.class) {
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
