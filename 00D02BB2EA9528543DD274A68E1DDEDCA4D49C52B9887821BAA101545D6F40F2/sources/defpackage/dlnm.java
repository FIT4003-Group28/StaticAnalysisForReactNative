package defpackage;
/* compiled from: PG */
/* renamed from: dlnm  reason: default package */
/* loaded from: classes6.dex */
public final class dlnm extends dsqw<dlnm, dlla> implements dssk {
    public static final dlnm l;
    private static volatile dssr<dlnm> m;
    public int a;
    public Object c;
    public Object e;
    public dpuq i;
    public dlmc j;
    public int b = 0;
    public int d = 0;
    public dspd f = dspd.b;
    public dspd g = dspd.b;
    public dsrj<dlkz> h = dssu.b;
    public dspd k = dspd.b;

    static {
        dlnm dlnmVar = new dlnm();
        l = dlnmVar;
        dsqw.cc(dlnm.class, dlnmVar);
    }

    private dlnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\u000f\u0002\u0001\u0001\u0011\u000f\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003ြ\u0000\u0004\u001b\u0005ဉ\t\u0006ြ\u0000\u0007ဉ\n\bည\u000b\tြ\u0000\nြ\u0000\u000bြ\u0000\rြ\u0001\u000eြ\u0001\u000fြ\u0000\u0011ြ\u0000", new Object[]{"c", "b", "e", "d", "a", "f", "g", dlmm.class, "h", dlkz.class, "i", dlms.class, "j", "k", dlmv.class, dlnh.class, dlle.class, dlnd.class, dllc.class, dlnl.class, dlnb.class});
            }
            if (i2 == 3) {
                return new dlnm();
            }
            if (i2 == 4) {
                return new dlla();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnm> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dlnm.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
