package defpackage;
/* compiled from: PG */
/* renamed from: ditl  reason: default package */
/* loaded from: classes6.dex */
public final class ditl extends dsqw<ditl, ditk> implements dssk {
    public static final ditl g;
    private static volatile dssr<ditl> h;
    public int a;
    public long b;
    public dhjz c;
    public double d;
    public dqyd e;
    public dsrj<dqyn> f = dssu.b;

    static {
        ditl ditlVar = new ditl();
        g = ditlVar;
        dsqw.cc(ditl.class, ditlVar);
    }

    private ditl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003က\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dqyn.class});
            }
            if (i2 == 3) {
                return new ditl();
            }
            if (i2 == 4) {
                return new ditk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ditl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ditl.class) {
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
