package defpackage;
/* compiled from: PG */
/* renamed from: cgcq  reason: default package */
/* loaded from: classes4.dex */
public final class cgcq extends dsqw<cgcq, cgcm> implements dssk {
    public static final cgcq e;
    private static volatile dssr<cgcq> f;
    public int a;
    public int b = 0;
    public Object c;
    public cgco d;

    static {
        cgcq cgcqVar = new cgcq();
        e = cgcqVar;
        dsqw.cc(cgcq.class, cgcqVar);
    }

    private cgcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bဉ\b\tြ\u0000", new Object[]{"c", "b", "a", cgbt.class, cgbw.class, cgby.class, cgca.class, cgcg.class, cgci.class, cgck.class, "d", cgcc.class});
            }
            if (i2 == 3) {
                return new cgcq();
            }
            if (i2 == 4) {
                return new cgcm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgcq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cgcq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
