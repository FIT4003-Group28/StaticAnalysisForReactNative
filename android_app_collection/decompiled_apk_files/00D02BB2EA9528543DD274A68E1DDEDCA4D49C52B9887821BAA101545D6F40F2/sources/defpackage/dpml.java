package defpackage;
/* compiled from: PG */
/* renamed from: dpml  reason: default package */
/* loaded from: classes.dex */
public final class dpml extends dsqw<dpml, dpmi> implements dssk {
    public static final dpml c;
    private static volatile dssr<dpml> d;
    public int a;
    public dpmk b;

    static {
        dpml dpmlVar = new dpml();
        c = dpmlVar;
        dsqw.cc(dpml.class, dpmlVar);
    }

    private dpml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpml();
            }
            if (i2 == 4) {
                return new dpmi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpml> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpml.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
