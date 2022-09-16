package defpackage;
/* compiled from: PG */
/* renamed from: dqah  reason: default package */
/* loaded from: classes6.dex */
public final class dqah extends dsqw<dqah, dqag> implements dssk {
    public static final dqah e;
    private static volatile dssr<dqah> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dqah dqahVar = new dqah();
        e = dqahVar;
        dsqw.cc(dqah.class, dqahVar);
    }

    private dqah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqah();
            }
            if (i2 == 4) {
                return new dqag();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqah> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqah.class) {
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
