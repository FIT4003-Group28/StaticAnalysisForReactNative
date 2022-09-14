package defpackage;
/* compiled from: PG */
/* renamed from: djkr  reason: default package */
/* loaded from: classes6.dex */
public final class djkr extends dsqw<djkr, djkq> implements dssk {
    public static final djkr d;
    private static volatile dssr<djkr> e;
    public int a;
    public int b;
    public dsrj<djkt> c = dssu.b;

    static {
        djkr djkrVar = new djkr();
        d = djkrVar;
        dsqw.cc(djkr.class, djkrVar);
    }

    private djkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", djnd.a, "c", djkt.class});
            }
            if (i2 == 3) {
                return new djkr();
            }
            if (i2 == 4) {
                return new djkq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djkr.class) {
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
