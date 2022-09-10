package defpackage;
/* compiled from: PG */
/* renamed from: dlmv  reason: default package */
/* loaded from: classes6.dex */
public final class dlmv extends dsqw<dlmv, dlmu> implements dssk {
    public static final dlmv f;
    private static volatile dssr<dlmv> g;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<dlmh> d = dssu.b;
    public dsrj<dspd> e = dssu.b;

    static {
        dlmv dlmvVar = new dlmv();
        f = dlmvVar;
        dsqw.cc(dlmv.class, dlmvVar);
    }

    private dlmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001c\u0004ဈ\u0001", new Object[]{"a", "b", "d", dlmh.class, "e", "c"});
            }
            if (i2 == 3) {
                return new dlmv();
            }
            if (i2 == 4) {
                return new dlmu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlmv.class) {
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
