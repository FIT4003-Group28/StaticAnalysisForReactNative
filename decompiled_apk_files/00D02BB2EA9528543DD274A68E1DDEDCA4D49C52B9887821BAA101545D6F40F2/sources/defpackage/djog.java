package defpackage;
/* compiled from: PG */
/* renamed from: djog  reason: default package */
/* loaded from: classes6.dex */
public final class djog extends dsqw<djog, djof> implements dssk {
    public static final djog a;
    private static volatile dssr<djog> b;

    static {
        djog djogVar = new djog();
        a = djogVar;
        dsqw.cc(djog.class, djogVar);
    }

    private djog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djog();
            }
            if (i2 == 4) {
                return new djof();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djog> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djog.class) {
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
