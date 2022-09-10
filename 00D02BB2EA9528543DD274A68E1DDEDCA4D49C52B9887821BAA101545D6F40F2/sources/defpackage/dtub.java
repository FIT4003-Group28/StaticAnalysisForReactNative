package defpackage;
/* compiled from: PG */
/* renamed from: dtub  reason: default package */
/* loaded from: classes6.dex */
public final class dtub extends dsqw<dtub, dtua> implements dssk {
    public static final dtub e;
    private static volatile dssr<dtub> f;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;

    static {
        dtub dtubVar = new dtub();
        e = dtubVar;
        dsqw.cc(dtub.class, dtubVar);
    }

    private dtub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"b", "a", "d", "c", dtwg.class, dtwc.class, dtwj.class, dtwe.class});
            }
            if (i2 == 3) {
                return new dtub();
            }
            if (i2 == 4) {
                return new dtua();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtub> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtub.class) {
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
