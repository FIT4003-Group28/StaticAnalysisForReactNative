package defpackage;
/* compiled from: PG */
/* renamed from: cqah  reason: default package */
/* loaded from: classes5.dex */
public final class cqah extends dsqw<cqah, cqag> implements dssk {
    public static final cqah e;
    private static volatile dssr<cqah> f;
    public int a;
    public int b;
    public int c;
    public boolean d;

    static {
        cqah cqahVar = new cqah();
        e = cqahVar;
        dsqw.cc(cqah.class, cqahVar);
    }

    private cqah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", cpxy.a, "c", cpxz.a, "d"});
            }
            if (i2 == 3) {
                return new cqah();
            }
            if (i2 == 4) {
                return new cqag();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cqah> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cqah.class) {
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
