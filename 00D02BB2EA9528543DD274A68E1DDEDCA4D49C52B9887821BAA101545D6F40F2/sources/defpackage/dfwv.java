package defpackage;
/* compiled from: PG */
/* renamed from: dfwv  reason: default package */
/* loaded from: classes.dex */
public final class dfwv extends dsqw<dfwv, dfwu> implements dssk {
    public static final dfwv e;
    private static volatile dssr<dfwv> f;
    public int a;
    public dsrj<dfwt> b = dssu.b;
    public String c = "";
    public int d;

    static {
        dfwv dfwvVar = new dfwv();
        e = dfwvVar;
        dsqw.cc(dfwv.class, dfwvVar);
    }

    private dfwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003င\u0001", new Object[]{"a", "b", dfwt.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dfwv();
            }
            if (i2 == 4) {
                return new dfwu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfwv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
