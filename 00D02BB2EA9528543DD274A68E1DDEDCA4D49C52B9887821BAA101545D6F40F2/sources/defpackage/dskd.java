package defpackage;
/* compiled from: PG */
/* renamed from: dskd  reason: default package */
/* loaded from: classes6.dex */
public final class dskd extends dsqw<dskd, dskb> implements dssk {
    public static final dskd g;
    private static volatile dssr<dskd> h;
    public int a;
    public duhe d;
    public int f;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        dskd dskdVar = new dskd();
        g = dskdVar;
        dsqw.cc(dskd.class, dskdVar);
    }

    private dskd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", dskc.a});
            }
            if (i2 == 3) {
                return new dskd();
            }
            if (i2 == 4) {
                return new dskb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dskd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dskd.class) {
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
