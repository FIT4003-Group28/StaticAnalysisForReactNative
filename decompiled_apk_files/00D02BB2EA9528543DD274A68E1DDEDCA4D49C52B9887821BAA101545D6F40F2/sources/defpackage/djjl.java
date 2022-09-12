package defpackage;
/* compiled from: PG */
/* renamed from: djjl  reason: default package */
/* loaded from: classes6.dex */
public final class djjl extends dsqw<djjl, djjk> implements dssk {
    public static final djjl a;
    private static volatile dssr<djjl> b;

    static {
        djjl djjlVar = new djjl();
        a = djjlVar;
        dsqw.cc(djjl.class, djjlVar);
    }

    private djjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djjl();
            }
            if (i2 == 4) {
                return new djjk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djjl.class) {
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
