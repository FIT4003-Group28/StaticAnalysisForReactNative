package defpackage;
/* compiled from: PG */
/* renamed from: ddwk  reason: default package */
/* loaded from: classes6.dex */
public final class ddwk extends dsqw<ddwk, ddwi> implements dssk {
    public static final ddwk f;
    private static volatile dssr<ddwk> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 1;

    static {
        ddwk ddwkVar = new ddwk();
        f = ddwkVar;
        dsqw.cc(ddwk.class, ddwkVar);
    }

    private ddwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", ddwj.a, "c", doza.c(), "d", dozy.c(), "e", doyd.c()});
            }
            if (i2 == 3) {
                return new ddwk();
            }
            if (i2 == 4) {
                return new ddwi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddwk.class) {
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
