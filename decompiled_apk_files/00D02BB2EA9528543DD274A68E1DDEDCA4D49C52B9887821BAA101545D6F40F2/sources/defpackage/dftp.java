package defpackage;
/* compiled from: PG */
/* renamed from: dftp  reason: default package */
/* loaded from: classes6.dex */
public final class dftp extends dsqw<dftp, dfto> implements dssk {
    public static final dftp e;
    private static volatile dssr<dftp> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        dftp dftpVar = new dftp();
        e = dftpVar;
        dsqw.cc(dftp.class, dftpVar);
    }

    private dftp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dftp();
            }
            if (i2 == 4) {
                return new dfto();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dftp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
