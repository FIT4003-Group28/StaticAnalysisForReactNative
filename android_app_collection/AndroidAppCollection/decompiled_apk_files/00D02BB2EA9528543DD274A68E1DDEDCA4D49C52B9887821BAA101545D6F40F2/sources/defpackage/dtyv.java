package defpackage;
/* compiled from: PG */
/* renamed from: dtyv  reason: default package */
/* loaded from: classes6.dex */
public final class dtyv extends dsqw<dtyv, dtyu> implements dssk {
    public static final dtyv c;
    private static volatile dssr<dtyv> d;
    public ducq a;
    public dtzp b;

    static {
        dtyv dtyvVar = new dtyv();
        c = dtyvVar;
        dsqw.cc(dtyv.class, dtyvVar);
    }

    private dtyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtyv();
            }
            if (i2 == 4) {
                return new dtyu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtyv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtyv.class) {
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
