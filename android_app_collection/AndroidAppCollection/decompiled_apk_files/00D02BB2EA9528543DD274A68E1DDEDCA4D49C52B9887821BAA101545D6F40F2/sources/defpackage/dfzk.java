package defpackage;
/* compiled from: PG */
/* renamed from: dfzk  reason: default package */
/* loaded from: classes6.dex */
public final class dfzk extends dsqw<dfzk, dfzj> implements dssk {
    public static final dfzk e;
    private static volatile dssr<dfzk> f;
    public int a;
    public dgly b;
    public dfzp c;
    public String d = "";

    static {
        dfzk dfzkVar = new dfzk();
        e = dfzkVar;
        dsqw.cc(dfzk.class, dfzkVar);
    }

    private dfzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfzk();
            }
            if (i2 == 4) {
                return new dfzj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfzk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfzk.class) {
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
