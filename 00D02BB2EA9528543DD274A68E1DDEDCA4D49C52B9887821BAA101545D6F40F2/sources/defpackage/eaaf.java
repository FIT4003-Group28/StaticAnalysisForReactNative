package defpackage;
/* compiled from: PG */
/* renamed from: eaaf  reason: default package */
/* loaded from: classes6.dex */
public final class eaaf extends dsqw<eaaf, eaae> implements dssk {
    public static final eaaf c;
    private static volatile dssr<eaaf> d;
    public int a;
    public int b;

    static {
        eaaf eaafVar = new eaaf();
        c = eaafVar;
        dsqw.cc(eaaf.class, eaafVar);
    }

    private eaaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eaaf();
            }
            if (i2 == 4) {
                return new eaae();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaaf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eaaf.class) {
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
