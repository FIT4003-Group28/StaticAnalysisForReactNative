package defpackage;
/* compiled from: PG */
/* renamed from: djgg  reason: default package */
/* loaded from: classes6.dex */
public final class djgg extends dsqw<djgg, djgf> implements dssk {
    public static final djgg a;
    private static volatile dssr<djgg> b;

    static {
        djgg djggVar = new djgg();
        a = djggVar;
        dsqw.cc(djgg.class, djggVar);
    }

    private djgg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djgg();
            }
            if (i2 == 4) {
                return new djgf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djgg.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
