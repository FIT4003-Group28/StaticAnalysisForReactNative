package defpackage;
/* compiled from: PG */
/* renamed from: dkuv  reason: default package */
/* loaded from: classes6.dex */
public final class dkuv extends dsqw<dkuv, dkuu> implements dssk {
    public static final dkuv d;
    private static volatile dssr<dkuv> f;
    public int a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dkuv dkuvVar = new dkuv();
        d = dkuvVar;
        dsqw.cc(dkuv.class, dkuvVar);
    }

    private dkuv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkuv();
            }
            if (i2 == 4) {
                return new dkuu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkuv.class) {
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
