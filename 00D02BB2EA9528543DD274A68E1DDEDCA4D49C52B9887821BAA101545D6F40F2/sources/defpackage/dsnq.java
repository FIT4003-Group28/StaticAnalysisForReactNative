package defpackage;
/* compiled from: PG */
/* renamed from: dsnq  reason: default package */
/* loaded from: classes6.dex */
public final class dsnq extends dsqw<dsnq, dsno> implements dssk {
    public static final dsnq g;
    private static volatile dssr<dsnq> h;
    public int a;
    public String b = "";
    public dsrf c = dsqz.b;
    public int d;
    public int e;
    public dsob f;

    static {
        dsnq dsnqVar = new dsnq();
        g = dsnqVar;
        dsqw.cc(dsnq.class, dsnqVar);
    }

    private dsnq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0016\u0002ဌ\u0002\u0003ဌ\u0003\u0004ဉ\u0004\u0006ဈ\u0001", new Object[]{"a", "c", "d", dsnu.a, "e", dsnp.a, "f", "b"});
            }
            if (i2 == 3) {
                return new dsnq();
            }
            if (i2 == 4) {
                return new dsno();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsnq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsnq.class) {
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
