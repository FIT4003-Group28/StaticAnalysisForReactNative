package defpackage;
/* compiled from: PG */
/* renamed from: ddvh  reason: default package */
/* loaded from: classes6.dex */
public final class ddvh extends dsqw<ddvh, ddvg> implements dssk {
    public static final ddvh e;
    private static volatile dssr<ddvh> f;
    public int a;
    public int b;
    public int c;
    public long d;

    static {
        ddvh ddvhVar = new ddvh();
        e = ddvhVar;
        dsqw.cc(ddvh.class, ddvhVar);
    }

    private ddvh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003စ\u0002", new Object[]{"a", "b", dqkr.c(), "c", dqkp.a, "d"});
            }
            if (i2 == 3) {
                return new ddvh();
            }
            if (i2 == 4) {
                return new ddvg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddvh.class) {
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
