package defpackage;
/* compiled from: PG */
/* renamed from: cyka  reason: default package */
/* loaded from: classes5.dex */
public final class cyka extends dsqw<cyka, cyjw> implements dssk {
    public static final cyka c;
    private static volatile dssr<cyka> d;
    public dssd<String, cyjy> a = dssd.b;
    public cylg b;

    static {
        cyka cykaVar = new cyka();
        c = cykaVar;
        dsqw.cc(cyka.class, cykaVar);
    }

    private cyka() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\t", new Object[]{"a", cyjz.a, "b"});
            }
            if (i2 == 3) {
                return new cyka();
            }
            if (i2 == 4) {
                return new cyjw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyka> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyka.class) {
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
