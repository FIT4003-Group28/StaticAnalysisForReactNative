package defpackage;
/* compiled from: PG */
/* renamed from: dqps  reason: default package */
/* loaded from: classes6.dex */
public final class dqps extends dsqw<dqps, dqpr> implements dssk {
    public static final dqps e;
    private static volatile dssr<dqps> g;
    public String a = "";
    public dsrj<dqpu> b = dssu.b;
    public String c = "";
    public int d;
    private int f;

    static {
        dqps dqpsVar = new dqps();
        e = dqpsVar;
        dsqw.cc(dqps.class, dqpsVar);
    }

    private dqps() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0004\u001b\u0005ဈ\u0003\u0006င\u0004", new Object[]{"f", "a", "b", dqpu.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dqps();
            }
            if (i2 == 4) {
                return new dqpr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqps> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqps.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
