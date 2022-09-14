package defpackage;
/* compiled from: PG */
/* renamed from: dgzj  reason: default package */
/* loaded from: classes6.dex */
public final class dgzj extends dsqw<dgzj, dgzi> implements dssk {
    public static final dgzj d;
    private static volatile dssr<dgzj> e;
    public int a;
    public int b;
    public int c;

    static {
        dgzj dgzjVar = new dgzj();
        d = dgzjVar;
        dsqw.cc(dgzj.class, dgzjVar);
    }

    private dgzj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dgyd.c(), "c"});
            }
            if (i2 == 3) {
                return new dgzj();
            }
            if (i2 == 4) {
                return new dgzi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgzj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
