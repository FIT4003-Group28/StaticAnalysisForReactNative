package defpackage;
/* compiled from: PG */
/* renamed from: dfwx  reason: default package */
/* loaded from: classes6.dex */
public final class dfwx extends dsqw<dfwx, dfww> implements dssk {
    public static final dfwx d;
    private static volatile dssr<dfwx> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dfwx dfwxVar = new dfwx();
        d = dfwxVar;
        dsqw.cc(dfwx.class, dfwxVar);
    }

    private dfwx() {
        dsqz dsqzVar = dsqz.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0000\u0000\u0004ဇ\u0000\u0007ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfwx();
            }
            if (i2 == 4) {
                return new dfww();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfwx.class) {
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
