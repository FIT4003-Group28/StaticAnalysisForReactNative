package defpackage;
/* compiled from: PG */
/* renamed from: dlmc  reason: default package */
/* loaded from: classes6.dex */
public final class dlmc extends dsqw<dlmc, dllf> implements dssk {
    public static final dlmc j;
    private static volatile dssr<dlmc> k;
    public int a;
    public Object c;
    public int d;
    public boolean e;
    public dlmb i;
    public int b = 0;
    public dsrj<dlln> f = dssu.b;
    public dsrj<dllp> g = dssu.b;
    public dsrj<dllx> h = dssu.b;

    static {
        dlmc dlmcVar = new dlmc();
        j = dlmcVar;
        dsqw.cc(dlmc.class, dlmcVar);
    }

    private dlmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0001\u0001\u0001\r\b\u0000\u0003\u0000\u0001ဌ\u0000\u0005ဇ\u0001\u0006\u001b\tြ\u0000\nြ\u0000\u000b\u001b\fဉ\u0004\r\u001b", new Object[]{"c", "b", "a", "d", dllr.c(), "e", "f", dlln.class, dllz.class, dllt.class, "g", dllp.class, "i", "h", dllx.class});
            }
            if (i2 == 3) {
                return new dlmc();
            }
            if (i2 == 4) {
                return new dllf();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmc> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dlmc.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
