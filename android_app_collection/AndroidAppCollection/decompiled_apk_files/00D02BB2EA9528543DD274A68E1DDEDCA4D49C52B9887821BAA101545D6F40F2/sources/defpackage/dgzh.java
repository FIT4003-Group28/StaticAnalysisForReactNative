package defpackage;
/* compiled from: PG */
/* renamed from: dgzh  reason: default package */
/* loaded from: classes6.dex */
public final class dgzh extends dsqw<dgzh, dgzg> implements dssk {
    public static final dgzh c;
    private static volatile dssr<dgzh> d;
    public int a;
    public dgzj b;

    static {
        dgzh dgzhVar = new dgzh();
        c = dgzhVar;
        dsqw.cc(dgzh.class, dgzhVar);
    }

    private dgzh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001&&\u0001\u0000\u0000\u0000&ဉ\u0003", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgzh();
            }
            if (i2 == 4) {
                return new dgzg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgzh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
