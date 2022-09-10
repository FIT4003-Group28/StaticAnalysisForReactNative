package defpackage;
/* compiled from: PG */
/* renamed from: drbr  reason: default package */
/* loaded from: classes.dex */
public final class drbr extends dsqw<drbr, drbq> implements dssk {
    public static final drbr d;
    private static volatile dssr<drbr> f;
    public dqpe a;
    public drgh b;
    public int c;
    private int e;

    static {
        drbr drbrVar = new drbr();
        d = drbrVar;
        dsqw.cc(drbr.class, drbrVar);
    }

    private drbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", drbs.a});
            }
            if (i2 == 3) {
                return new drbr();
            }
            if (i2 == 4) {
                return new drbq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drbr.class) {
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
