package defpackage;
/* compiled from: PG */
/* renamed from: bjfw  reason: default package */
/* loaded from: classes3.dex */
public final class bjfw extends dsqw<bjfw, bjfv> implements dssk {
    public static final bjfw l;
    private static volatile dssr<bjfw> m;
    public int a;
    public bjfu b;
    public bjfq c;
    public int e;
    public int f;
    public boolean i;
    public boolean k;
    public String d = "";
    public String g = "";
    public String h = "";
    public String j = "";

    static {
        bjfw bjfwVar = new bjfw();
        l = bjfwVar;
        dsqw.cc(bjfw.class, bjfwVar);
    }

    private bjfw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဈ\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", dqjh.c(), "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new bjfw();
            }
            if (i2 == 4) {
                return new bjfv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfw> dssrVar = m;
            if (dssrVar == null) {
                synchronized (bjfw.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
