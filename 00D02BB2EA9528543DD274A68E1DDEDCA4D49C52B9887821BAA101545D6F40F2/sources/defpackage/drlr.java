package defpackage;
/* compiled from: PG */
/* renamed from: drlr  reason: default package */
/* loaded from: classes.dex */
public final class drlr extends dsqw<drlr, drlq> implements dssk {
    public static final drlr d;
    private static volatile dssr<drlr> f;
    public int a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        drlr drlrVar = new drlr();
        d = drlrVar;
        dsqw.cc(drlr.class, drlrVar);
    }

    private drlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0006ဌ\u0001", new Object[]{"e", "b", "c", "a", dprz.c()});
            }
            if (i2 == 3) {
                return new drlr();
            }
            if (i2 == 4) {
                return new drlq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drlr.class) {
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
