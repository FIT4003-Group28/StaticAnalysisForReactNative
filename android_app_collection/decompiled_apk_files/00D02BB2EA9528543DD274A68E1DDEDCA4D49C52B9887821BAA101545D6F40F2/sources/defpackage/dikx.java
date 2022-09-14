package defpackage;
/* compiled from: PG */
/* renamed from: dikx  reason: default package */
/* loaded from: classes6.dex */
public final class dikx extends dsqw<dikx, dikw> implements dssk {
    public static final dikx c;
    private static volatile dssr<dikx> e;
    public drdg a;
    public int b = 1;
    private int d;

    static {
        dikx dikxVar = new dikx();
        c = dikxVar;
        dsqw.cc(dikx.class, dikxVar);
    }

    private dikx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဉ\u0000", new Object[]{"d", "b", doay.c(), "a"});
            }
            if (i2 == 3) {
                return new dikx();
            }
            if (i2 == 4) {
                return new dikw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dikx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dikx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
