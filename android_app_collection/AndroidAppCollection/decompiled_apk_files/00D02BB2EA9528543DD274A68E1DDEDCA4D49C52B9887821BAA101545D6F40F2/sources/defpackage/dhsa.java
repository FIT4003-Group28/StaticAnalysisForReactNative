package defpackage;
/* compiled from: PG */
/* renamed from: dhsa  reason: default package */
/* loaded from: classes6.dex */
public final class dhsa extends dsqw<dhsa, dhrz> implements dssk {
    public static final dhsa g;
    private static volatile dssr<dhsa> h;
    public int a;
    public dsrj<dqzx> b = dssu.b;
    public doek c;
    public dqyd d;
    public long e;
    public boolean f;

    static {
        dhsa dhsaVar = new dhsa();
        g = dhsaVar;
        dsqw.cc(dhsa.class, dhsaVar);
    }

    private dhsa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0000\u0003\u001b\u0004ဉ\u0000\u0006ဉ\u0001\u0007ဂ\u0003\tဇ\u0004", new Object[]{"a", "b", dqzx.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dhsa();
            }
            if (i2 == 4) {
                return new dhrz();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dhsa.class) {
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
