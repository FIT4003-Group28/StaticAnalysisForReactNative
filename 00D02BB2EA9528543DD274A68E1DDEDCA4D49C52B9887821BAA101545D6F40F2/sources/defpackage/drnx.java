package defpackage;
/* compiled from: PG */
/* renamed from: drnx  reason: default package */
/* loaded from: classes6.dex */
public final class drnx extends dsqw<drnx, drnv> implements dssk {
    public static final drnx c;
    private static volatile dssr<drnx> d;
    public int a = 0;
    public Object b;

    static {
        drnx drnxVar = new drnx();
        c = drnxVar;
        dsqw.cc(drnx.class, drnxVar);
    }

    private drnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", drmv.class, drmr.class, drml.class});
            }
            if (i2 == 3) {
                return new drnx();
            }
            if (i2 == 4) {
                return new drnv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drnx.class) {
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
