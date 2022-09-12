package defpackage;
/* compiled from: PG */
/* renamed from: dmby  reason: default package */
/* loaded from: classes6.dex */
public final class dmby extends dsqw<dmby, dmbx> implements dssk {
    public static final dmby h;
    private static volatile dssr<dmby> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public dnpq f;
    public dnpq g;

    static {
        dmby dmbyVar = new dmby();
        h = dmbyVar;
        dsqw.cc(dmby.class, dmbyVar);
    }

    private dmby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006င\u0002", new Object[]{"a", "b", dqjh.c(), "c", "e", "f", "g", "d"});
            }
            if (i3 == 3) {
                return new dmby();
            }
            if (i3 == 4) {
                return new dmbx();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmby> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmby.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
