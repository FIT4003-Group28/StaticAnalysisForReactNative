package defpackage;
/* compiled from: PG */
/* renamed from: dibc  reason: default package */
/* loaded from: classes6.dex */
public final class dibc extends dsqw<dibc, diba> implements dssk {
    public static final dibc d;
    private static volatile dssr<dibc> g;
    public long a;
    public long b;
    public int c;
    private int e;
    private dssd<String, String> f = dssd.b;

    static {
        dibc dibcVar = new dibc();
        d = dibcVar;
        dsqw.cc(dibc.class, dibcVar);
    }

    private dibc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0001\u0000\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဌ\u0004\b2", new Object[]{"e", "a", "b", "c", dqhy.c(), "f", dibb.a});
            }
            if (i2 == 3) {
                return new dibc();
            }
            if (i2 == 4) {
                return new diba();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dibc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dibc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
