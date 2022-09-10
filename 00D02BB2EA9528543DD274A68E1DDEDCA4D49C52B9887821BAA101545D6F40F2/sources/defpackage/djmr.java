package defpackage;
/* compiled from: PG */
/* renamed from: djmr  reason: default package */
/* loaded from: classes6.dex */
public final class djmr extends dsqw<djmr, djmm> implements dssk {
    public static final djmr c;
    private static volatile dssr<djmr> d;
    public int a = 0;
    public Object b;

    static {
        djmr djmrVar = new djmr();
        c = djmrVar;
        dsqw.cc(djmr.class, djmrVar);
    }

    private djmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ှ\u0000", new Object[]{"b", "a", djmq.c()});
            }
            if (i2 == 3) {
                return new djmr();
            }
            if (i2 == 4) {
                return new djmm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djmr.class) {
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
