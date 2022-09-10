package defpackage;
/* compiled from: PG */
/* renamed from: djxr  reason: default package */
/* loaded from: classes6.dex */
public final class djxr extends dsqw<djxr, djxq> implements dssk {
    public static final djxr g;
    private static volatile dssr<djxr> h;
    public int a;
    public long e;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        djxr djxrVar = new djxr();
        g = djxrVar;
        dsqw.cc(djxr.class, djxrVar);
    }

    private djxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new djxr();
            }
            if (i2 == 4) {
                return new djxq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djxr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djxr.class) {
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
