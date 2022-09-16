package defpackage;
/* compiled from: PG */
/* renamed from: dfur  reason: default package */
/* loaded from: classes6.dex */
public final class dfur extends dsqw<dfur, dfuq> implements dssk {
    public static final dfur e;
    private static volatile dssr<dfur> f;
    public dfuw a;
    public dfut b;
    public String c = "";
    public dsrj<String> d = dssu.b;

    static {
        dfur dfurVar = new dfur();
        e = dfurVar;
        dsqw.cc(dfur.class, dfurVar);
    }

    private dfur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ț", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfur();
            }
            if (i2 == 4) {
                return new dfuq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfur> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfur.class) {
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
