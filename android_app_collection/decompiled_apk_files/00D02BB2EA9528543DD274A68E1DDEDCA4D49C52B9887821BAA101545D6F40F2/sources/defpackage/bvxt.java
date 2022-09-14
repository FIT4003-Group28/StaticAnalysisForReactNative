package defpackage;
/* compiled from: PG */
/* renamed from: bvxt  reason: default package */
/* loaded from: classes4.dex */
public final class bvxt extends dsqw<bvxt, bvxq> implements dssk {
    public static final bvxt c;
    private static volatile dssr<bvxt> d;
    public int a = 0;
    public Object b;

    static {
        bvxt bvxtVar = new bvxt();
        c = bvxtVar;
        dsqw.cc(bvxt.class, bvxtVar);
    }

    private bvxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001်\u0000\u0002ြ\u0000", new Object[]{"b", "a", bvxs.class});
            }
            if (i2 == 3) {
                return new bvxt();
            }
            if (i2 == 4) {
                return new bvxq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvxt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bvxt.class) {
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
