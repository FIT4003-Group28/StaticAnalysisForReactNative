package defpackage;
/* compiled from: PG */
/* renamed from: drjl  reason: default package */
/* loaded from: classes6.dex */
public final class drjl extends dsqw<drjl, drjk> implements dssk {
    public static final drjl f;
    private static volatile dssr<drjl> g;
    public int a;
    public drdg b;
    public dqfu c;
    public dqfu d;
    public int e;

    static {
        drjl drjlVar = new drjl();
        f = drjlVar;
        dsqw.cc(drjl.class, drjlVar);
    }

    private drjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004င\u0005", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drjl();
            }
            if (i2 == 4) {
                return new drjk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drjl.class) {
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
