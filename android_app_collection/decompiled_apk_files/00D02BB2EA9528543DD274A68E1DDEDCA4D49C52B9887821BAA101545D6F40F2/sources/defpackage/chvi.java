package defpackage;
/* compiled from: PG */
/* renamed from: chvi  reason: default package */
/* loaded from: classes4.dex */
public final class chvi extends dsqw<chvi, chvf> implements dssk {
    public static final chvi f;
    private static volatile dssr<chvi> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public chxv e;

    static {
        chvi chviVar = new chvi();
        f = chviVar;
        dsqw.cc(chvi.class, chviVar);
    }

    private chvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", chvg.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new chvi();
            }
            if (i2 == 4) {
                return new chvf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chvi.class) {
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
