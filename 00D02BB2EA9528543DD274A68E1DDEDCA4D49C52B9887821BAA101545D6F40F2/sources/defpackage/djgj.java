package defpackage;
/* compiled from: PG */
/* renamed from: djgj  reason: default package */
/* loaded from: classes6.dex */
public final class djgj extends dsqw<djgj, djgi> implements dssk {
    public static final djgj b;
    private static volatile dssr<djgj> d;
    public int a;
    private int c;

    static {
        djgj djgjVar = new djgj();
        b = djgjVar;
        dsqw.cc(djgj.class, djgjVar);
    }

    private djgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djgj();
            }
            if (i2 == 4) {
                return new djgi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgj.class) {
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
