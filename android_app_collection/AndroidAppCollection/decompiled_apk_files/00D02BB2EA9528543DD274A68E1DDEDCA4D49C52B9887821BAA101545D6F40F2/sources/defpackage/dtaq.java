package defpackage;
/* compiled from: PG */
/* renamed from: dtaq  reason: default package */
/* loaded from: classes6.dex */
public final class dtaq extends dsqw<dtaq, dtap> implements dssk {
    public static final dtaq m;
    private static volatile dssr<dtaq> n;
    public int a;
    public int b;
    public int c;
    public long d;
    public dtak e;
    public dtam f;
    public float g;
    public int h = 100;
    public dtai i;
    public dtai j;
    public float k;
    public dtao l;

    static {
        dtaq dtaqVar = new dtaq();
        m = dtaqVar;
        dsqw.cc(dtaq.class, dtaqVar);
    }

    private dtaq() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0013\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ဉ\u0004\u0007ခ\u0007\bင\b\nဉ\t\u000eဉ\u0006\u0011ဉ\u000b\u0012ခ\f\u0013ဉ\u0012", new Object[]{"a", "b", dtau.a, "c", dtat.a, "d", "e", "g", "h", "i", "f", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dtaq();
            }
            if (i2 == 4) {
                return new dtap();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtaq> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dtaq.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
