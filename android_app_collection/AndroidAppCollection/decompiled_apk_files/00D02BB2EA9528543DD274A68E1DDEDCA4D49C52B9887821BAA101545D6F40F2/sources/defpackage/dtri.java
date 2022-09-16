package defpackage;
/* compiled from: PG */
/* renamed from: dtri  reason: default package */
/* loaded from: classes6.dex */
public final class dtri extends dsqw<dtri, dtrh> implements dssk {
    public static final dtri d;
    private static volatile dssr<dtri> f;
    public String a = "";
    public boolean b = true;
    public boolean c;
    private int e;

    static {
        dtri dtriVar = new dtri();
        d = dtriVar;
        dsqw.cc(dtri.class, dtriVar);
    }

    private dtri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtri();
            }
            if (i2 == 4) {
                return new dtrh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtri> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtri.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
