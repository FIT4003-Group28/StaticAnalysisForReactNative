package defpackage;
/* compiled from: PG */
/* renamed from: dhsp  reason: default package */
/* loaded from: classes6.dex */
public final class dhsp extends dsqw<dhsp, dhso> implements dssk {
    public static final dhsp f;
    private static volatile dssr<dhsp> g;
    public int a;
    public drco b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dhsp dhspVar = new dhsp();
        f = dhspVar;
        dsqw.cc(dhsp.class, dhspVar);
    }

    private dhsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dhsp();
            }
            if (i2 == 4) {
                return new dhso();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhsp.class) {
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
