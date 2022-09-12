package defpackage;
/* compiled from: PG */
/* renamed from: dnjv  reason: default package */
/* loaded from: classes6.dex */
public final class dnjv extends dsqw<dnjv, dnju> implements dssk {
    public static final dnjv g;
    private static volatile dssr<dnjv> h;
    public int a;
    public dnjl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dnjv dnjvVar = new dnjv();
        g = dnjvVar;
        dsqw.cc(dnjv.class, dnjvVar);
    }

    private dnjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dnjv();
            }
            if (i2 == 4) {
                return new dnju();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnjv.class) {
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
