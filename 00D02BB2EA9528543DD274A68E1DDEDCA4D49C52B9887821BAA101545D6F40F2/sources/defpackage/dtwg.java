package defpackage;
/* compiled from: PG */
/* renamed from: dtwg  reason: default package */
/* loaded from: classes6.dex */
public final class dtwg extends dsqw<dtwg, dtwf> implements dssk {
    public static final dtwg b;
    private static volatile dssr<dtwg> c;
    public dtwp a;

    static {
        dtwg dtwgVar = new dtwg();
        b = dtwgVar;
        dsqw.cc(dtwg.class, dtwgVar);
    }

    private dtwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtwg();
            }
            if (i2 == 4) {
                return new dtwf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtwg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
