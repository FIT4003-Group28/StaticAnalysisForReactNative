package defpackage;
/* compiled from: PG */
/* renamed from: dnmp  reason: default package */
/* loaded from: classes6.dex */
public final class dnmp extends dsqw<dnmp, dnma> implements dssk {
    public static final dnmp c;
    private static volatile dssr<dnmp> d;
    public int a = 0;
    public Object b;

    static {
        dnmp dnmpVar = new dnmp();
        c = dnmpVar;
        dsqw.cc(dnmp.class, dnmpVar);
    }

    private dnmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", dnmo.class, dnmk.class, dnmc.class, dnlz.class, dnmm.class, dnmg.class, dnmi.class});
            }
            if (i2 == 3) {
                return new dnmp();
            }
            if (i2 == 4) {
                return new dnma();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnmp.class) {
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
