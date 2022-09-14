package defpackage;
/* compiled from: PG */
/* renamed from: djee  reason: default package */
/* loaded from: classes6.dex */
public final class djee extends dsqw<djee, djed> implements dssk {
    public static final djee a;
    private static volatile dssr<djee> b;

    static {
        djee djeeVar = new djee();
        a = djeeVar;
        dsqw.cc(djee.class, djeeVar);
    }

    private djee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djee();
            }
            if (i2 == 4) {
                return new djed();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djee> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djee.class) {
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
