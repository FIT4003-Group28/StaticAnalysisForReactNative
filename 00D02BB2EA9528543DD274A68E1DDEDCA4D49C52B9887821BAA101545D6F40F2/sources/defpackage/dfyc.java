package defpackage;
/* compiled from: PG */
/* renamed from: dfyc  reason: default package */
/* loaded from: classes6.dex */
public final class dfyc extends dsqw<dfyc, dfyb> implements dssk {
    public static final dfyc e;
    private static volatile dssr<dfyc> f;
    public int a;
    public dszq b;
    public String c = "";
    public String d = "";

    static {
        dfyc dfycVar = new dfyc();
        e = dfycVar;
        dsqw.cc(dfyc.class, dfycVar);
    }

    private dfyc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfyc();
            }
            if (i2 == 4) {
                return new dfyb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfyc.class) {
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
