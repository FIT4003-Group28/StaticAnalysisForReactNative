package defpackage;
/* compiled from: PG */
/* renamed from: dfvu  reason: default package */
/* loaded from: classes6.dex */
public final class dfvu extends dsqw<dfvu, dfvt> implements dssk {
    public static final dfvu c;
    private static volatile dssr<dfvu> e;
    public long a;
    public int b;
    private int d;

    static {
        dfvu dfvuVar = new dfvu();
        c = dfvuVar;
        dsqw.cc(dfvu.class, dfvuVar);
    }

    private dfvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဏ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dfvu();
            }
            if (i2 == 4) {
                return new dfvt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfvu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
