package defpackage;
/* compiled from: PG */
/* renamed from: drot  reason: default package */
/* loaded from: classes6.dex */
public final class drot extends dsqw<drot, droi> implements dssk {
    public static final drot e;
    private static volatile dssr<drot> f;
    public int a;
    public int b;
    public String c = "";
    public droq d;

    static {
        drot drotVar = new drot();
        e = drotVar;
        dsqw.cc(drot.class, drotVar);
    }

    private drot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", dros.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new drot();
            }
            if (i2 == 4) {
                return new droi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drot> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drot.class) {
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
