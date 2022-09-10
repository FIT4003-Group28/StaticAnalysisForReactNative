package defpackage;
/* compiled from: PG */
/* renamed from: bjfq  reason: default package */
/* loaded from: classes3.dex */
public final class bjfq extends dsqw<bjfq, bjfp> implements dssk {
    public static final bjfq g;
    private static volatile dssr<bjfq> h;
    public int a;
    public boolean c;
    public boolean d;
    public String b = "";
    public String e = "";
    public String f = "";

    static {
        bjfq bjfqVar = new bjfq();
        g = bjfqVar;
        dsqw.cc(bjfq.class, bjfqVar);
    }

    private bjfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new bjfq();
            }
            if (i2 == 4) {
                return new bjfp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (bjfq.class) {
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
