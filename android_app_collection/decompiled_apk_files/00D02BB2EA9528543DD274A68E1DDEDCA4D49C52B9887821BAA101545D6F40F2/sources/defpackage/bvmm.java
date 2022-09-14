package defpackage;
/* compiled from: PG */
/* renamed from: bvmm  reason: default package */
/* loaded from: classes4.dex */
public final class bvmm extends dsqw<bvmm, bvmj> implements dssk {
    public static final bvmm e;
    private static volatile dssr<bvmm> f;
    public int a;
    public bvml b;
    public bvml c;
    public bvml d;

    static {
        bvmm bvmmVar = new bvmm();
        e = bvmmVar;
        dsqw.cc(bvmm.class, bvmmVar);
    }

    private bvmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bvmm();
            }
            if (i2 == 4) {
                return new bvmj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvmm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bvmm.class) {
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
