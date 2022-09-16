package defpackage;
/* compiled from: PG */
/* renamed from: dfym  reason: default package */
/* loaded from: classes6.dex */
public final class dfym extends dsqw<dfym, dfyl> implements dssk {
    public static final dfym c;
    private static volatile dssr<dfym> d;
    public int a;
    public dfwr b;

    static {
        dfym dfymVar = new dfym();
        c = dfymVar;
        dsqw.cc(dfym.class, dfymVar);
    }

    private dfym() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfym();
            }
            if (i2 == 4) {
                return new dfyl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfym> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfym.class) {
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
