package defpackage;
/* compiled from: PG */
/* renamed from: djeg  reason: default package */
/* loaded from: classes6.dex */
public final class djeg extends dsqw<djeg, djef> implements dssk {
    public static final djeg a;
    private static volatile dssr<djeg> b;

    static {
        djeg djegVar = new djeg();
        a = djegVar;
        dsqw.cc(djeg.class, djegVar);
    }

    private djeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djeg();
            }
            if (i2 == 4) {
                return new djef();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djeg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djeg.class) {
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
