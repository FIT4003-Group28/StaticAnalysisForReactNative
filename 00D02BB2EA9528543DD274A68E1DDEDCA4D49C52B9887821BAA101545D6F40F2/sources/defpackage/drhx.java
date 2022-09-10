package defpackage;
/* compiled from: PG */
/* renamed from: drhx  reason: default package */
/* loaded from: classes6.dex */
public final class drhx extends dsqw<drhx, drho> implements dssk {
    public static final drhx c;
    private static volatile dssr<drhx> d;
    public int a = 0;
    public Object b;

    static {
        drhx drhxVar = new drhx();
        c = drhxVar;
        dsqw.cc(drhx.class, drhxVar);
    }

    private drhx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", drhw.class, drhs.class});
            }
            if (i2 == 3) {
                return new drhx();
            }
            if (i2 == 4) {
                return new drho();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drhx.class) {
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
