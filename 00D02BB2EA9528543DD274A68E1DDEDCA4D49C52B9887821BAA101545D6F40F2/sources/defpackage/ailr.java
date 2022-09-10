package defpackage;
/* compiled from: PG */
/* renamed from: ailr  reason: default package */
/* loaded from: classes2.dex */
public final class ailr extends dsqw<ailr, ailq> implements dssk {
    public static final ailr e;
    private static volatile dssr<ailr> f;
    public int a;
    public long b;
    public ajja c;
    public int d;

    static {
        ailr ailrVar = new ailr();
        e = ailrVar;
        dsqw.cc(ailr.class, ailrVar);
    }

    private ailr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", ailp.c()});
            }
            if (i2 == 3) {
                return new ailr();
            }
            if (i2 == 4) {
                return new ailq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ailr.class) {
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
