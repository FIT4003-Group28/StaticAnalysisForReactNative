package defpackage;
/* compiled from: PG */
/* renamed from: dljf  reason: default package */
/* loaded from: classes6.dex */
public final class dljf extends dsqw<dljf, dlje> implements dssk {
    public static final dljf g;
    private static volatile dssr<dljf> h;
    public int a;
    public String b = "";
    public String c = "";
    public dspd d = dspd.b;
    public String e = "";
    public String f = "";

    static {
        dljf dljfVar = new dljf();
        g = dljfVar;
        dsqw.cc(dljf.class, dljfVar);
    }

    private dljf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dljf();
            }
            if (i2 == 4) {
                return new dlje();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dljf.class) {
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
