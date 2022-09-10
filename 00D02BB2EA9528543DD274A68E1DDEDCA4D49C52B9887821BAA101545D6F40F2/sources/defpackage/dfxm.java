package defpackage;
/* compiled from: PG */
/* renamed from: dfxm  reason: default package */
/* loaded from: classes6.dex */
public final class dfxm extends dsqw<dfxm, dfxl> implements dssk {
    public static final dfxm d;
    private static volatile dssr<dfxm> e;
    public int a;
    public dfwr b;
    public dspd c = dspd.b;

    static {
        dfxm dfxmVar = new dfxm();
        d = dfxmVar;
        dsqw.cc(dfxm.class, dfxmVar);
    }

    private dfxm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfxm();
            }
            if (i2 == 4) {
                return new dfxl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfxm.class) {
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
