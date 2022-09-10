package defpackage;
/* compiled from: PG */
/* renamed from: eavo  reason: default package */
/* loaded from: classes6.dex */
public final class eavo extends dsqw<eavo, eavn> implements dssk {
    public static final eavo a;
    private static volatile dssr<eavo> b;

    static {
        eavo eavoVar = new eavo();
        a = eavoVar;
        dsqw.cc(eavo.class, eavoVar);
    }

    private eavo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new eavo();
            }
            if (i2 == 4) {
                return new eavn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (eavo.class) {
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
