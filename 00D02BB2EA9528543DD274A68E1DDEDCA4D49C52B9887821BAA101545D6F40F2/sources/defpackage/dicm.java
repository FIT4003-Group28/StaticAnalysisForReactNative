package defpackage;
/* compiled from: PG */
/* renamed from: dicm  reason: default package */
/* loaded from: classes6.dex */
public final class dicm extends dsqw<dicm, dicl> implements dssk {
    public static final dicm a;
    private static volatile dssr<dicm> b;

    static {
        dicm dicmVar = new dicm();
        a = dicmVar;
        dsqw.cc(dicm.class, dicmVar);
    }

    private dicm() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dicm();
            }
            if (i2 == 4) {
                return new dicl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dicm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dicm.class) {
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
