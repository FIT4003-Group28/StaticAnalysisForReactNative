package defpackage;
/* compiled from: PG */
/* renamed from: dgfi  reason: default package */
/* loaded from: classes6.dex */
public final class dgfi extends dsqw<dgfi, dgfh> implements dssk {
    public static final dgfi e;
    private static volatile dssr<dgfi> f;
    public int a;
    public int b;
    public dgly c;
    public duhk d;

    static {
        dgfi dgfiVar = new dgfi();
        e = dgfiVar;
        dsqw.cc(dgfi.class, dgfiVar);
    }

    private dgfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0000\u0004ဌ\u0003\u0005ဉ\u0004\bဉ\u0007", new Object[]{"a", "b", dgfj.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dgfi();
            }
            if (i2 == 4) {
                return new dgfh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgfi.class) {
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
