package defpackage;
/* compiled from: PG */
/* renamed from: eayr  reason: default package */
/* loaded from: classes6.dex */
public final class eayr extends dsqw<eayr, eayq> implements dssk {
    public static final eayr c;
    private static volatile dssr<eayr> d;
    public int a;
    public int b = 1;

    static {
        eayr eayrVar = new eayr();
        c = eayrVar;
        dsqw.cc(eayr.class, eayrVar);
    }

    private eayr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", eays.a});
            }
            if (i2 == 3) {
                return new eayr();
            }
            if (i2 == 4) {
                return new eayq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eayr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
