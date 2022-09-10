package defpackage;
/* compiled from: PG */
/* renamed from: ckxj  reason: default package */
/* loaded from: classes5.dex */
public final class ckxj extends dsqw<ckxj, ckxi> implements dssk {
    public static final ckxj d;
    private static volatile dssr<ckxj> e;
    public int a;
    public long b;
    public ckxh c;

    static {
        ckxj ckxjVar = new ckxj();
        d = ckxjVar;
        dsqw.cc(ckxj.class, ckxjVar);
    }

    private ckxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckxj();
            }
            if (i2 == 4) {
                return new ckxi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckxj.class) {
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
