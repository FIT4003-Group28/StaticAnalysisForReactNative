package defpackage;
/* compiled from: PG */
/* renamed from: dmzt  reason: default package */
/* loaded from: classes6.dex */
public final class dmzt extends dsqw<dmzt, dmzs> implements dssk {
    public static final dmzt e;
    private static volatile dssr<dmzt> g;
    public dmzv a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        dmzt dmztVar = new dmzt();
        e = dmztVar;
        dsqw.cc(dmzt.class, dmztVar);
    }

    private dmzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0002", new Object[]{"f", "a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dmzt();
            }
            if (i2 == 4) {
                return new dmzs();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmzt.class) {
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
