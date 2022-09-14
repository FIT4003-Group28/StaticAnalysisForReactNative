package defpackage;
/* compiled from: PG */
/* renamed from: diuv  reason: default package */
/* loaded from: classes6.dex */
public final class diuv extends dsqw<diuv, diuq> implements dssk {
    public static final diuv g;
    private static volatile dssr<diuv> h;
    public int a;
    public dpuq c;
    public boolean e;
    public dsrj<diuu> b = dssu.b;
    public dspd d = dspd.b;
    public String f = "";

    static {
        diuv diuvVar = new diuv();
        g = diuvVar;
        dsqw.cc(diuv.class, diuvVar);
    }

    private diuv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ည\u0001\u0004ဇ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", diuu.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new diuv();
            }
            if (i2 == 4) {
                return new diuq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diuv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
