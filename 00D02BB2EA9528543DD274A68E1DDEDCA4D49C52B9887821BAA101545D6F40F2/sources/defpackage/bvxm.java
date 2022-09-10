package defpackage;
/* compiled from: PG */
/* renamed from: bvxm  reason: default package */
/* loaded from: classes4.dex */
public final class bvxm extends dsqw<bvxm, bvxj> implements dssk {
    public static final bvxm e;
    private static volatile dssr<bvxm> f;
    public int a;
    public String b = "";
    public int c = 1;
    public int d;

    static {
        bvxm bvxmVar = new bvxm();
        e = bvxmVar;
        dsqw.cc(bvxm.class, bvxmVar);
    }

    private bvxm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", bvxk.a, "d"});
            }
            if (i2 == 3) {
                return new bvxm();
            }
            if (i2 == 4) {
                return new bvxj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvxm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bvxm.class) {
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
