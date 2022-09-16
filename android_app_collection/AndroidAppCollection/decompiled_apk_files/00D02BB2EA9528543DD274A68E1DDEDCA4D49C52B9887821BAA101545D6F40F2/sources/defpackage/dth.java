package defpackage;
/* compiled from: PG */
/* renamed from: dth  reason: default package */
/* loaded from: classes6.dex */
public final class dth extends dsqw<dth, dtg> implements dssk {
    public static final dth f;
    private static volatile dssr<dth> g;
    public int a;
    public dvzn b;
    public doxf c;
    public int d;
    public long e = -1;

    static {
        dth dthVar = new dth();
        f = dthVar;
        dsqw.cc(dth.class, dthVar);
    }

    private dth() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", dowa.c(), "e"});
            }
            if (i2 == 3) {
                return new dth();
            }
            if (i2 == 4) {
                return new dtg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dth> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dth.class) {
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
