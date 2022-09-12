package defpackage;
/* compiled from: PG */
/* renamed from: dmcv  reason: default package */
/* loaded from: classes6.dex */
public final class dmcv extends dsqw<dmcv, dmcu> implements dssk {
    public static final dmcv c;
    public static final dsqv<dmch, dmcv> d;
    private static volatile dssr<dmcv> e;
    public int a;
    public dspd b = dspd.b;

    static {
        dmcv dmcvVar = new dmcv();
        c = dmcvVar;
        dsqw.cc(dmcv.class, dmcvVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmcvVar, dmcvVar, null, 1001, dsur.MESSAGE, dmcv.class);
    }

    private dmcv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmcv();
            }
            if (i2 == 4) {
                return new dmcu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmcv.class) {
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
