package defpackage;
/* compiled from: PG */
/* renamed from: ddmc  reason: default package */
/* loaded from: classes6.dex */
public final class ddmc extends dsqw<ddmc, ddmb> implements dssk {
    public static final ddmc d;
    private static volatile dssr<ddmc> e;
    public int a;
    public int b;
    public boolean c;

    static {
        ddmc ddmcVar = new ddmc();
        d = ddmcVar;
        dsqw.cc(ddmc.class, ddmcVar);
    }

    private ddmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddmc();
            }
            if (i2 == 4) {
                return new ddmb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddmc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddmc.class) {
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
