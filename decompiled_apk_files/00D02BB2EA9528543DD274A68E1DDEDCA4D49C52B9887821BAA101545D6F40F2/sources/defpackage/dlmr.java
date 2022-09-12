package defpackage;
/* compiled from: PG */
/* renamed from: dlmr  reason: default package */
/* loaded from: classes6.dex */
public final class dlmr extends dsqw<dlmr, dlmo> implements dssk {
    public static final dlmr d;
    private static volatile dssr<dlmr> e;
    public int a;
    public dspd b = dspd.b;
    public int c;

    static {
        dlmr dlmrVar = new dlmr();
        d = dlmrVar;
        dsqw.cc(dlmr.class, dlmrVar);
    }

    private dlmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dlmq.c()});
            }
            if (i2 == 3) {
                return new dlmr();
            }
            if (i2 == 4) {
                return new dlmo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlmr.class) {
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
