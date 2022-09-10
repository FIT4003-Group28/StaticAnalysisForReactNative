package defpackage;
/* compiled from: PG */
/* renamed from: dnvh  reason: default package */
/* loaded from: classes6.dex */
public final class dnvh extends dsqw<dnvh, dnve> implements dssk {
    public static final dnvh d;
    private static volatile dssr<dnvh> e;
    public int a;
    public int b;
    public dpci c;

    static {
        dnvh dnvhVar = new dnvh();
        d = dnvhVar;
        dsqw.cc(dnvh.class, dnvhVar);
    }

    private dnvh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဌ\u0000", new Object[]{"a", "c", "b", dnvf.a});
            }
            if (i2 == 3) {
                return new dnvh();
            }
            if (i2 == 4) {
                return new dnve();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnvh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnvh.class) {
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
