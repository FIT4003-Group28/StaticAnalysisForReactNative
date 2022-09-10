package defpackage;
/* compiled from: PG */
/* renamed from: dgcc  reason: default package */
/* loaded from: classes6.dex */
public final class dgcc extends dsqw<dgcc, dgbz> implements dssk {
    public static final dgcc e;
    private static volatile dssr<dgcc> f;
    public int a;
    public int b;
    public dsrj<dgcb> c = dssu.b;
    public dgbo d;

    static {
        dgcc dgccVar = new dgcc();
        e = dgccVar;
        dsqw.cc(dgcc.class, dgccVar);
    }

    private dgcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", dgbx.a, "c", dgcb.class, "d"});
            }
            if (i2 == 3) {
                return new dgcc();
            }
            if (i2 == 4) {
                return new dgbz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgcc.class) {
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
