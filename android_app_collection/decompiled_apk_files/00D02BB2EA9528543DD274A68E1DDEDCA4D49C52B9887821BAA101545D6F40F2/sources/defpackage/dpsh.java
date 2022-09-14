package defpackage;
/* compiled from: PG */
/* renamed from: dpsh  reason: default package */
/* loaded from: classes.dex */
public final class dpsh extends dsqw<dpsh, dpsg> implements dssk {
    public static final dpsh e;
    private static volatile dssr<dpsh> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dpsh dpshVar = new dpsh();
        e = dpshVar;
        dsqw.cc(dpsh.class, dpshVar);
    }

    private dpsh() {
    }

    public static /* synthetic */ void b(dpsh dpshVar) {
        dpshVar.a |= 2;
        dpshVar.b = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0001\u0005ဇ\u0003", new Object[]{"a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dpsh();
            }
            if (i2 == 4) {
                return new dpsg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpsh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
