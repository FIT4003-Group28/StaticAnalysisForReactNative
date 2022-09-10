package defpackage;
/* compiled from: PG */
/* renamed from: djkp  reason: default package */
/* loaded from: classes6.dex */
public final class djkp extends dsqw<djkp, djko> implements dssk {
    public static final djkp a;
    private static volatile dssr<djkp> b;

    static {
        djkp djkpVar = new djkp();
        a = djkpVar;
        dsqw.cc(djkp.class, djkpVar);
    }

    private djkp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djkp();
            }
            if (i2 == 4) {
                return new djko();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djkp.class) {
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
