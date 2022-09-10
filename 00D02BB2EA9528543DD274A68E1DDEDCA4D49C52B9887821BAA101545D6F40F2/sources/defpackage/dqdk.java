package defpackage;
/* compiled from: PG */
/* renamed from: dqdk  reason: default package */
/* loaded from: classes6.dex */
public final class dqdk extends dsqw<dqdk, dqdj> implements dssk {
    public static final dqdk e;
    private static volatile dssr<dqdk> f;
    public int a;
    public dplx b;
    public dqmk c;
    public String d = "";

    static {
        dqdk dqdkVar = new dqdk();
        e = dqdkVar;
        dsqw.cc(dqdk.class, dqdkVar);
    }

    private dqdk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqdk();
            }
            if (i2 == 4) {
                return new dqdj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqdk.class) {
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
