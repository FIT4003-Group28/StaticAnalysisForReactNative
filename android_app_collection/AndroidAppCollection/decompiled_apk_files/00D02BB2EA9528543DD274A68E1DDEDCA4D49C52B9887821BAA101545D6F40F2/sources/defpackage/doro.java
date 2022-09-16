package defpackage;
/* compiled from: PG */
/* renamed from: doro  reason: default package */
/* loaded from: classes6.dex */
public final class doro extends dsqw<doro, dorn> implements dssk {
    public static final doro f;
    private static volatile dssr<doro> g;
    public int a;
    public dorm b;
    public dons c;
    public dnjn d;
    public dqfd e;

    static {
        doro doroVar = new doro();
        f = doroVar;
        dsqw.cc(doro.class, doroVar);
    }

    private doro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0006\u0013\u0004\u0000\u0000\u0000\u0006ဉ\u0003\bဉ\u0005\u000fဉ\u000e\u0013ဉ\r", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new doro();
            }
            if (i2 == 4) {
                return new dorn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doro> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doro.class) {
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
