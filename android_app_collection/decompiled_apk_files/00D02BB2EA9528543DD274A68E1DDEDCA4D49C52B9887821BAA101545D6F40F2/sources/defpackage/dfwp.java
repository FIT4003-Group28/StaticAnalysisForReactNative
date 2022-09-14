package defpackage;
/* compiled from: PG */
/* renamed from: dfwp  reason: default package */
/* loaded from: classes6.dex */
public final class dfwp extends dsqw<dfwp, dfwo> implements dssk {
    public static final dfwp d;
    private static volatile dssr<dfwp> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dfwp dfwpVar = new dfwp();
        d = dfwpVar;
        dsqw.cc(dfwp.class, dfwpVar);
    }

    private dfwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dfwn.c(), "c"});
            }
            if (i2 == 3) {
                return new dfwp();
            }
            if (i2 == 4) {
                return new dfwo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfwp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
