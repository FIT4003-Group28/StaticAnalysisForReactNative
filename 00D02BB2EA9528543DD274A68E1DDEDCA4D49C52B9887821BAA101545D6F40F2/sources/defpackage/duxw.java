package defpackage;
/* compiled from: PG */
/* renamed from: duxw  reason: default package */
/* loaded from: classes.dex */
public final class duxw extends dsqw<duxw, duxv> implements dssk {
    public static final duxw b;
    private static volatile dssr<duxw> d;
    public int a = 500;
    private int c;

    static {
        duxw duxwVar = new duxw();
        b = duxwVar;
        dsqw.cc(duxw.class, duxwVar);
    }

    private duxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new duxw();
            }
            if (i2 == 4) {
                return new duxv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duxw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
