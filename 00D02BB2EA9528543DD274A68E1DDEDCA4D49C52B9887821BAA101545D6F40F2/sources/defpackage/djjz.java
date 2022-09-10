package defpackage;
/* compiled from: PG */
/* renamed from: djjz  reason: default package */
/* loaded from: classes6.dex */
public final class djjz extends dsqw<djjz, djjy> implements dssk {
    public static final djjz a;
    private static volatile dssr<djjz> b;

    static {
        djjz djjzVar = new djjz();
        a = djjzVar;
        dsqw.cc(djjz.class, djjzVar);
    }

    private djjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djjz();
            }
            if (i2 == 4) {
                return new djjy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djjz.class) {
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
