package defpackage;
/* compiled from: PG */
/* renamed from: dsns  reason: default package */
/* loaded from: classes6.dex */
public final class dsns extends dsqw<dsns, dsnr> implements dssk {
    public static final dsns f;
    private static volatile dssr<dsns> g;
    public int a;
    public boolean c;
    public dsob e;
    public String b = "";
    public dsrf d = dsqz.b;

    static {
        dsns dsnsVar = new dsns();
        f = dsnsVar;
        dsqw.cc(dsns.class, dsnsVar);
    }

    private dsns() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0016\u0002ဉ\u0003\u0003ဇ\u0002\u0005ဈ\u0001", new Object[]{"a", "d", "e", "c", "b"});
            }
            if (i2 == 3) {
                return new dsns();
            }
            if (i2 == 4) {
                return new dsnr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsns> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsns.class) {
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
