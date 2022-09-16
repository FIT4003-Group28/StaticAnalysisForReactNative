package defpackage;
/* compiled from: PG */
/* renamed from: drtv  reason: default package */
/* loaded from: classes6.dex */
public final class drtv extends dsqw<drtv, drtt> implements dssk {
    public static final drtv e;
    private static volatile dssr<drtv> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        drtv drtvVar = new drtv();
        e = drtvVar;
        dsqw.cc(drtv.class, drtvVar);
    }

    private drtv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", drtu.a});
            }
            if (i2 == 3) {
                return new drtv();
            }
            if (i2 == 4) {
                return new drtt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drtv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drtv.class) {
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
