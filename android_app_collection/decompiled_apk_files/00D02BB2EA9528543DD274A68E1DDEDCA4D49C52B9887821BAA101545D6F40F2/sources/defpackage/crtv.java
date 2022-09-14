package defpackage;
/* compiled from: PG */
/* renamed from: crtv  reason: default package */
/* loaded from: classes5.dex */
public final class crtv extends dsqw<crtv, crtu> implements dssk {
    public static final crtv e;
    private static volatile dssr<crtv> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        crtv crtvVar = new crtv();
        e = crtvVar;
        dsqw.cc(crtv.class, crtvVar);
    }

    private crtv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", crtx.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new crtv();
            }
            if (i2 == 4) {
                return new crtu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crtv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (crtv.class) {
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
