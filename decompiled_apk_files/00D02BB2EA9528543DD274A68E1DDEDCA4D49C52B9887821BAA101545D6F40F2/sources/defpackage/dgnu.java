package defpackage;
/* compiled from: PG */
/* renamed from: dgnu  reason: default package */
/* loaded from: classes6.dex */
public final class dgnu extends dsqw<dgnu, dgns> implements dssk {
    public static final dgnu f;
    private static volatile dssr<dgnu> g;
    public int a;
    public int b;
    public dgnn c;
    public dnqe d;
    public dhjz e;

    static {
        dgnu dgnuVar = new dgnu();
        f = dgnuVar;
        dsqw.cc(dgnu.class, dgnuVar);
    }

    private dgnu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", dgnt.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgnu();
            }
            if (i2 == 4) {
                return new dgns();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgnu.class) {
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
