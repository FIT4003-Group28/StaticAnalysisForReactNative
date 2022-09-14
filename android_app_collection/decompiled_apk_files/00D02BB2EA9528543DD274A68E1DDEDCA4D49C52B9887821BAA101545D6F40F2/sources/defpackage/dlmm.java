package defpackage;
/* compiled from: PG */
/* renamed from: dlmm  reason: default package */
/* loaded from: classes6.dex */
public final class dlmm extends dsqw<dlmm, dlmd> implements dssk {
    public static final dlmm f;
    private static volatile dssr<dlmm> g;
    public int a;
    public String b = "";
    public dsrj<dlmh> c = dssu.b;
    public dlmh d;
    public dlml e;

    static {
        dlmm dlmmVar = new dlmm();
        f = dlmmVar;
        dsqw.cc(dlmm.class, dlmmVar);
    }

    private dlmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", dlmh.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dlmm();
            }
            if (i2 == 4) {
                return new dlmd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlmm.class) {
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
