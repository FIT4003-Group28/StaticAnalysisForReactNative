package defpackage;
/* compiled from: PG */
/* renamed from: dfvw  reason: default package */
/* loaded from: classes6.dex */
public final class dfvw extends dsqw<dfvw, dfvv> implements dssk {
    public static final dfvw b;
    private static volatile dssr<dfvw> c;
    public dsrj<dfyc> a;

    static {
        dfvw dfvwVar = new dfvw();
        b = dfvwVar;
        dsqw.cc(dfvw.class, dfvwVar);
    }

    private dfvw() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dfyc.class});
            }
            if (i2 == 3) {
                return new dfvw();
            }
            if (i2 == 4) {
                return new dfvv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfvw.class) {
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
