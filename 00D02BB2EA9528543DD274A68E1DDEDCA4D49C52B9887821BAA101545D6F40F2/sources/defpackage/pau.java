package defpackage;
/* compiled from: PG */
/* renamed from: pau  reason: default package */
/* loaded from: classes7.dex */
public final class pau extends dsqw<pau, pat> implements dssk {
    public static final pau f;
    private static volatile dssr<pau> g;
    public int a;
    public long c;
    public int e;
    public String b = "";
    public String d = "";

    static {
        pau pauVar = new pau();
        f = pauVar;
        dsqw.cc(pau.class, pauVar);
    }

    private pau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", pal.a});
            }
            if (i2 == 3) {
                return new pau();
            }
            if (i2 == 4) {
                return new pat();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pau> dssrVar = g;
            if (dssrVar == null) {
                synchronized (pau.class) {
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
