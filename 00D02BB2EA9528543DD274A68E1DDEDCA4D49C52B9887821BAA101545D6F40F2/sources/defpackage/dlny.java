package defpackage;
/* compiled from: PG */
/* renamed from: dlny  reason: default package */
/* loaded from: classes6.dex */
public final class dlny extends dsqw<dlny, dlnp> implements dssk {
    public static final dlny f;
    private static volatile dssr<dlny> g;
    public int a;
    public String b;
    public String c;
    public dlnv d;
    public dsrj<dlnx> e;

    static {
        dlny dlnyVar = new dlny();
        f = dlnyVar;
        dsqw.cc(dlny.class, dlnyVar);
    }

    private dlny() {
        dspd dspdVar = dspd.b;
        this.b = "";
        this.c = "";
        this.e = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", dlnx.class});
            }
            if (i2 == 3) {
                return new dlny();
            }
            if (i2 == 4) {
                return new dlnp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlny> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlny.class) {
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
