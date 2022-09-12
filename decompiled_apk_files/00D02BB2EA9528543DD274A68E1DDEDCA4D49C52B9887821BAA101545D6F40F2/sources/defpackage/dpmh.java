package defpackage;
/* compiled from: PG */
/* renamed from: dpmh  reason: default package */
/* loaded from: classes6.dex */
public final class dpmh extends dsqw<dpmh, dpmg> implements dssk {
    public static final dpmh c;
    private static volatile dssr<dpmh> e;
    public dqmr a;
    public dpll b;
    private int d;

    static {
        dpmh dpmhVar = new dpmh();
        c = dpmhVar;
        dsqw.cc(dpmh.class, dpmhVar);
    }

    private dpmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpmh();
            }
            if (i2 == 4) {
                return new dpmg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpmh.class) {
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
