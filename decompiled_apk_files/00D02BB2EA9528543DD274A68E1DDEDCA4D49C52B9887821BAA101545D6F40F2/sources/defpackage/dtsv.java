package defpackage;
/* compiled from: PG */
/* renamed from: dtsv  reason: default package */
/* loaded from: classes6.dex */
public final class dtsv extends dsqw<dtsv, dtsm> implements dssk {
    public static final dtsv c;
    private static volatile dssr<dtsv> d;
    public dtsr a;
    public dtsu b;

    static {
        dtsv dtsvVar = new dtsv();
        c = dtsvVar;
        dsqw.cc(dtsv.class, dtsvVar);
    }

    private dtsv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtsv();
            }
            if (i2 == 4) {
                return new dtsm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtsv.class) {
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
