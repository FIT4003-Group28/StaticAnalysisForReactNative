package defpackage;
/* compiled from: PG */
/* renamed from: deab  reason: default package */
/* loaded from: classes.dex */
public final class deab extends dsqw<deab, ddzy> implements dssk {
    public static final deab c;
    private static volatile dssr<deab> d;
    public int a;
    public int b;

    static {
        deab deabVar = new deab();
        c = deabVar;
        dsqw.cc(deab.class, deabVar);
    }

    private deab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", deaa.c()});
            }
            if (i2 == 3) {
                return new deab();
            }
            if (i2 == 4) {
                return new ddzy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deab> dssrVar = d;
            if (dssrVar == null) {
                synchronized (deab.class) {
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
