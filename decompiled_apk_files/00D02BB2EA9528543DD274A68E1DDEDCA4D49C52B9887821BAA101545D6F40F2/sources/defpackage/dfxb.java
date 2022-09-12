package defpackage;
/* compiled from: PG */
/* renamed from: dfxb  reason: default package */
/* loaded from: classes6.dex */
public final class dfxb extends dsqw<dfxb, dfxa> implements dssk {
    public static final dfxb e;
    private static volatile dssr<dfxb> f;
    public int a;
    public dfwz b;
    public dfwi c;
    public dfxy d;

    static {
        dfxb dfxbVar = new dfxb();
        e = dfxbVar;
        dsqw.cc(dfxb.class, dfxbVar);
    }

    private dfxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfxb();
            }
            if (i2 == 4) {
                return new dfxa();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfxb.class) {
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
