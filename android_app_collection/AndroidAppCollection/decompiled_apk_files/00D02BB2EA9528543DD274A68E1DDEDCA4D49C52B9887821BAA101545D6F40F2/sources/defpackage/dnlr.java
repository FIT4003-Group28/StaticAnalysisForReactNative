package defpackage;
/* compiled from: PG */
/* renamed from: dnlr  reason: default package */
/* loaded from: classes6.dex */
public final class dnlr extends dsqw<dnlr, dnlo> implements dssk {
    public static final dnlr c;
    private static volatile dssr<dnlr> d;
    public int a;
    public int b;

    static {
        dnlr dnlrVar = new dnlr();
        c = dnlrVar;
        dsqw.cc(dnlr.class, dnlrVar);
    }

    private dnlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dnlp.a});
            }
            if (i2 == 3) {
                return new dnlr();
            }
            if (i2 == 4) {
                return new dnlo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnlr.class) {
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
