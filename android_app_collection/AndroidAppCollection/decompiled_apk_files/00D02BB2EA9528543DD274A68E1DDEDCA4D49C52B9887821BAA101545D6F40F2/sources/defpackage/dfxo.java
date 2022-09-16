package defpackage;
/* compiled from: PG */
/* renamed from: dfxo  reason: default package */
/* loaded from: classes6.dex */
public final class dfxo extends dsqw<dfxo, dfxn> implements dssk {
    public static final dfxo f;
    private static volatile dssr<dfxo> g;
    public int a;
    public dfwc b;
    public dfxm c;
    public dfyi d;
    public dfxm e;

    static {
        dfxo dfxoVar = new dfxo();
        f = dfxoVar;
        dsqw.cc(dfxo.class, dfxoVar);
    }

    private dfxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfxo();
            }
            if (i2 == 4) {
                return new dfxn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfxo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
