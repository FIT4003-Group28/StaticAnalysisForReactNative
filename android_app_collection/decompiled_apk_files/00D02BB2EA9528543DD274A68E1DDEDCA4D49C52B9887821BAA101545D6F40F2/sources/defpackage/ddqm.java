package defpackage;
/* compiled from: PG */
/* renamed from: ddqm  reason: default package */
/* loaded from: classes.dex */
public final class ddqm extends dsqw<ddqm, ddql> implements dssk {
    public static final ddqm d;
    private static volatile dssr<ddqm> e;
    public int a;
    public boolean b;
    public int c;

    static {
        ddqm ddqmVar = new ddqm();
        d = ddqmVar;
        dsqw.cc(ddqm.class, ddqmVar);
    }

    private ddqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", duwz.a});
            }
            if (i2 == 3) {
                return new ddqm();
            }
            if (i2 == 4) {
                return new ddql();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddqm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
