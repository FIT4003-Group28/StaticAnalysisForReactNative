package defpackage;
/* compiled from: PG */
/* renamed from: dpna  reason: default package */
/* loaded from: classes6.dex */
public final class dpna extends dsqw<dpna, dpmz> implements dssk {
    public static final dpna c;
    private static volatile dssr<dpna> d;
    public int a = 0;
    public Object b;

    static {
        dpna dpnaVar = new dpna();
        c = dpnaVar;
        dsqw.cc(dpna.class, dpnaVar);
    }

    private dpna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", dpsp.class, dpze.class, dqdm.class, dpuu.class, dpus.class});
            }
            if (i2 == 3) {
                return new dpna();
            }
            if (i2 == 4) {
                return new dpmz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpna> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpna.class) {
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
