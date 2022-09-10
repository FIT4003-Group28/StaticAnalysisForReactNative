package defpackage;
/* compiled from: PG */
/* renamed from: dpsj  reason: default package */
/* loaded from: classes.dex */
public final class dpsj extends dsqw<dpsj, dpsi> implements dssk {
    public static final dpsj d;
    private static volatile dssr<dpsj> f;
    public dqpe a;
    public int b;
    public dsrj<drbh> c = dssu.b;
    private int e;

    static {
        dpsj dpsjVar = new dpsj();
        d = dpsjVar;
        dsqw.cc(dpsj.class, dpsjVar);
    }

    private dpsj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"e", "a", "b", drbs.a, "c", drbh.class});
            }
            if (i2 == 3) {
                return new dpsj();
            }
            if (i2 == 4) {
                return new dpsi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpsj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
