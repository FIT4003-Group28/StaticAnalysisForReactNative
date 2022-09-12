package defpackage;
/* compiled from: PG */
/* renamed from: djll  reason: default package */
/* loaded from: classes6.dex */
public final class djll extends dsqw<djll, djlk> implements dssk {
    public static final djll a;
    private static volatile dssr<djll> b;

    static {
        djll djllVar = new djll();
        a = djllVar;
        dsqw.cc(djll.class, djllVar);
    }

    private djll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djll();
            }
            if (i2 == 4) {
                return new djlk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djll> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djll.class) {
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
