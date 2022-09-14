package defpackage;
/* compiled from: PG */
/* renamed from: dowm  reason: default package */
/* loaded from: classes.dex */
public final class dowm extends dsqw<dowm, dowj> implements dssk {
    public static final dowm c;
    private static volatile dssr<dowm> d;
    public int a;
    public int b;

    static {
        dowm dowmVar = new dowm();
        c = dowmVar;
        dsqw.cc(dowm.class, dowmVar);
    }

    private dowm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dowl.c()});
            }
            if (i2 == 3) {
                return new dowm();
            }
            if (i2 == 4) {
                return new dowj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dowm.class) {
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
