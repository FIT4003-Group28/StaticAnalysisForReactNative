package defpackage;
/* compiled from: PG */
/* renamed from: dxtx  reason: default package */
/* loaded from: classes6.dex */
public final class dxtx extends dsqw<dxtx, dxtv> implements dssk {
    public static final dxtx e;
    private static volatile dssr<dxtx> f;
    public int b;
    public int d;
    public String a = "";
    public dspd c = dspd.b;

    static {
        dxtx dxtxVar = new dxtx();
        e = dxtxVar;
        dsqw.cc(dxtx.class, dxtxVar);
    }

    private dxtx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0005\f\f\n", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dxtx();
            }
            if (i2 == 4) {
                return new dxtv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxtx.class) {
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
