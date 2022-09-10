package defpackage;
/* compiled from: PG */
/* renamed from: dvxq  reason: default package */
/* loaded from: classes6.dex */
public final class dvxq extends dsqw<dvxq, dvxp> implements dssk {
    public static final dvxq c;
    private static volatile dssr<dvxq> d;
    public int a;
    public boolean b;

    static {
        dvxq dvxqVar = new dvxq();
        c = dvxqVar;
        dsqw.cc(dvxq.class, dvxqVar);
    }

    private dvxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvxq();
            }
            if (i2 == 4) {
                return new dvxp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvxq.class) {
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
