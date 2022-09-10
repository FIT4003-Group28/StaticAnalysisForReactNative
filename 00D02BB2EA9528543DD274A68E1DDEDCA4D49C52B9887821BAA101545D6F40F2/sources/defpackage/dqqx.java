package defpackage;
/* compiled from: PG */
/* renamed from: dqqx  reason: default package */
/* loaded from: classes6.dex */
public final class dqqx extends dsqw<dqqx, dqqt> implements dssk {
    public static final dqqx d;
    private static volatile dssr<dqqx> f;
    public int a = 0;
    public Object b;
    public dqqv c;
    private int e;

    static {
        dqqx dqqxVar = new dqqx();
        d = dqqxVar;
        dsqw.cc(dqqx.class, dqqxVar);
    }

    private dqqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bဉ\u0007", new Object[]{"b", "a", "e", dqqg.class, dqqo.class, dqqz.class, dqrf.class, dqrl.class, dqrr.class, dqrv.class, "c"});
            }
            if (i2 == 3) {
                return new dqqx();
            }
            if (i2 == 4) {
                return new dqqt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqqx.class) {
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
