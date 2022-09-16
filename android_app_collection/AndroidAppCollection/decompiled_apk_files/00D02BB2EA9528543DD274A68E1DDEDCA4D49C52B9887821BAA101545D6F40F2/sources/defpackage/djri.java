package defpackage;
/* compiled from: PG */
/* renamed from: djri  reason: default package */
/* loaded from: classes6.dex */
public final class djri extends dsqw<djri, djrh> implements dssk {
    public static final djri a;
    private static volatile dssr<djri> b;

    static {
        djri djriVar = new djri();
        a = djriVar;
        dsqw.cc(djri.class, djriVar);
    }

    private djri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djri();
            }
            if (i2 == 4) {
                return new djrh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djri> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djri.class) {
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
