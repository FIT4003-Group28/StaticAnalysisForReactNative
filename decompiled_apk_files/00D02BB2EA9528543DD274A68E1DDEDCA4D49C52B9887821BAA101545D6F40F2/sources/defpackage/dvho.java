package defpackage;
/* compiled from: PG */
/* renamed from: dvho  reason: default package */
/* loaded from: classes.dex */
public final class dvho extends dsqw<dvho, dvhn> implements dssk {
    public static final dvho f;
    private static volatile dssr<dvho> g;
    public int a;
    public String b = "";
    public dqpe c;
    public dsrj<dqfq> d;
    public int e;

    static {
        dvho dvhoVar = new dvho();
        f = dvhoVar;
        dsqw.cc(dvho.class, dvhoVar);
    }

    private dvho() {
        dssu<Object> dssuVar = dssu.b;
        this.d = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0000\u0005\u001b", new Object[]{"a", "c", "e", drbs.a, "b", "d", dqfq.class});
            }
            if (i2 == 3) {
                return new dvho();
            }
            if (i2 == 4) {
                return new dvhn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvho> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvho.class) {
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
