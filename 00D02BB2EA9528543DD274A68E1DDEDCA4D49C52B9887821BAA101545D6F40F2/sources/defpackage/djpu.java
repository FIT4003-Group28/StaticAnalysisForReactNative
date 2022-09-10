package defpackage;
/* compiled from: PG */
/* renamed from: djpu  reason: default package */
/* loaded from: classes6.dex */
public final class djpu extends dsqw<djpu, djpn> implements dssk {
    public static final djpu b;
    private static volatile dssr<djpu> c;
    public dsrj<djpr> a = dssu.b;

    static {
        djpu djpuVar = new djpu();
        b = djpuVar;
        dsqw.cc(djpu.class, djpuVar);
    }

    private djpu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", djpr.class});
            }
            if (i2 == 3) {
                return new djpu();
            }
            if (i2 == 4) {
                return new djpn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djpu.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
