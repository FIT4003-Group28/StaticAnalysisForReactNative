package defpackage;
/* compiled from: PG */
/* renamed from: dvrr  reason: default package */
/* loaded from: classes6.dex */
public final class dvrr extends dsqw<dvrr, dvrq> implements dssk {
    public static final dvrr e;
    private static volatile dssr<dvrr> f;
    public int a;
    public boolean b;
    public int c = 3;
    public boolean d;

    static {
        dvrr dvrrVar = new dvrr();
        e = dvrrVar;
        dsqw.cc(dvrr.class, dvrrVar);
    }

    private dvrr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvrr();
            }
            if (i2 == 4) {
                return new dvrq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvrr.class) {
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
