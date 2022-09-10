package defpackage;
/* compiled from: PG */
/* renamed from: dorg  reason: default package */
/* loaded from: classes.dex */
public final class dorg extends dsqw<dorg, dorf> implements dssk {
    public static final dorg g;
    private static volatile dssr<dorg> h;
    public int a;
    public int d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        dorg dorgVar = new dorg();
        g = dorgVar;
        dsqw.cc(dorg.class, dorgVar);
    }

    private dorg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dorg();
            }
            if (i2 == 4) {
                return new dorf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dorg.class) {
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
