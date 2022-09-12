package defpackage;
/* compiled from: PG */
/* renamed from: dqyw  reason: default package */
/* loaded from: classes6.dex */
public final class dqyw extends dsqw<dqyw, dqyp> implements dssk {
    public static final dqyw d;
    private static volatile dssr<dqyw> f;
    public int a;
    public dqyr b;
    public dqyt c;
    private dqyv e;

    static {
        dqyw dqywVar = new dqyw();
        d = dqywVar;
        dsqw.cc(dqyw.class, dqywVar);
    }

    private dqyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dqyw();
            }
            if (i2 == 4) {
                return new dqyp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqyw.class) {
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
