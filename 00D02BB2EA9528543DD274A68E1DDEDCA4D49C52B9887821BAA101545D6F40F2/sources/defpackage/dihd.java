package defpackage;
/* compiled from: PG */
/* renamed from: dihd  reason: default package */
/* loaded from: classes6.dex */
public final class dihd extends dsqw<dihd, dihc> implements dssk {
    public static final dihd b;
    private static volatile dssr<dihd> d;
    public int a;
    private int c;

    static {
        dihd dihdVar = new dihd();
        b = dihdVar;
        dsqw.cc(dihd.class, dihdVar);
    }

    private dihd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dihd();
            }
            if (i2 == 4) {
                return new dihc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dihd.class) {
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
