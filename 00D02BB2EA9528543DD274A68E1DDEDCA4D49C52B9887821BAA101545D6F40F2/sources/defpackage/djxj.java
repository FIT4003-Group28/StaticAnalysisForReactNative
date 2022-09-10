package defpackage;
/* compiled from: PG */
/* renamed from: djxj  reason: default package */
/* loaded from: classes6.dex */
public final class djxj extends dsqw<djxj, djxi> implements dssk {
    public static final djxj b;
    private static volatile dssr<djxj> c;
    public dsrj<djxh> a = dssu.b;

    static {
        djxj djxjVar = new djxj();
        b = djxjVar;
        dsqw.cc(djxj.class, djxjVar);
    }

    private djxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djxh.class});
            }
            if (i2 == 3) {
                return new djxj();
            }
            if (i2 == 4) {
                return new djxi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djxj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djxj.class) {
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
