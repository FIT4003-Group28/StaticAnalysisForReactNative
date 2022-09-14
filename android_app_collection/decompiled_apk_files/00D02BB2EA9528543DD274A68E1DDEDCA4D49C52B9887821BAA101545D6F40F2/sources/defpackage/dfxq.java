package defpackage;
/* compiled from: PG */
/* renamed from: dfxq  reason: default package */
/* loaded from: classes6.dex */
public final class dfxq extends dsqw<dfxq, dfxp> implements dssk {
    public static final dfxq d;
    private static volatile dssr<dfxq> e;
    public int a;
    public dfwr b;
    public dfwr c;

    static {
        dfxq dfxqVar = new dfxq();
        d = dfxqVar;
        dsqw.cc(dfxq.class, dfxqVar);
    }

    private dfxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfxq();
            }
            if (i2 == 4) {
                return new dfxp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfxq.class) {
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
