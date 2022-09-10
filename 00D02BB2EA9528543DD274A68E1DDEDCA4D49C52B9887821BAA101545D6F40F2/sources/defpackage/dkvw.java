package defpackage;
/* compiled from: PG */
/* renamed from: dkvw  reason: default package */
/* loaded from: classes6.dex */
public final class dkvw extends dsqw<dkvw, dkvv> implements dssk {
    public static final dkvw b;
    private static volatile dssr<dkvw> d;
    public boolean a;
    private int c;

    static {
        dkvw dkvwVar = new dkvw();
        b = dkvwVar;
        dsqw.cc(dkvw.class, dkvwVar);
    }

    private dkvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkvw();
            }
            if (i2 == 4) {
                return new dkvv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkvw.class) {
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
