package defpackage;
/* compiled from: PG */
/* renamed from: bvxp  reason: default package */
/* loaded from: classes4.dex */
public final class bvxp extends dsqw<bvxp, bvxo> implements dssk {
    public static final bvxp d;
    private static volatile dssr<bvxp> e;
    public int a;
    public int b = -432917966;
    public int c = -420943123;

    static {
        bvxp bvxpVar = new bvxp();
        d = bvxpVar;
        dsqw.cc(bvxp.class, bvxpVar);
    }

    private bvxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bvxp();
            }
            if (i2 == 4) {
                return new bvxo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvxp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bvxp.class) {
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
