package defpackage;
/* compiled from: PG */
/* renamed from: dubf  reason: default package */
/* loaded from: classes.dex */
public final class dubf extends dsqw<dubf, dube> implements dssk {
    public static final dubf g;
    private static volatile dssr<dubf> h;
    public duaz a;
    public dtzt b;
    public dtzz c;
    public dubh d;
    public dsrj<dubq> e = dssu.b;
    public dsrf f = dsqz.b;

    static {
        dubf dubfVar = new dubf();
        g = dubfVar;
        dsqw.cc(dubf.class, dubfVar);
    }

    private dubf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"a", "b", "c", "d", "e", dubq.class, "f"});
            }
            if (i2 == 3) {
                return new dubf();
            }
            if (i2 == 4) {
                return new dube();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dubf.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
