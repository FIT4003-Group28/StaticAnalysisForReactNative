package defpackage;
/* compiled from: PG */
/* renamed from: dqze  reason: default package */
/* loaded from: classes.dex */
public final class dqze extends dsqw<dqze, dqzb> implements dssk {
    public static final dqze e;
    private static volatile dssr<dqze> g;
    public boolean a;
    public boolean b;
    public boolean c = true;
    public dqzd d;
    private int f;

    static {
        dqze dqzeVar = new dqze();
        e = dqzeVar;
        dsqw.cc(dqze.class, dqzeVar);
    }

    private dqze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0002\u0005ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqze();
            }
            if (i2 == 4) {
                return new dqzb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqze> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqze.class) {
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
