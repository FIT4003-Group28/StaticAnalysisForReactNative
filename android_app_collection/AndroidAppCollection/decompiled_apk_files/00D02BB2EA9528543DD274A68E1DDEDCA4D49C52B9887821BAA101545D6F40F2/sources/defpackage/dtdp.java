package defpackage;
/* compiled from: PG */
/* renamed from: dtdp  reason: default package */
/* loaded from: classes6.dex */
public final class dtdp extends dsqw<dtdp, dtdo> implements dssk {
    public static final dtdp a;
    private static volatile dssr<dtdp> f;
    private int b;
    private dgrh c;
    private dgrn d;
    private byte e = 2;

    static {
        dtdp dtdpVar = new dtdp();
        a = dtdpVar;
        dsqw.cc(dtdp.class, dtdpVar);
    }

    private dtdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtdp();
            }
            if (i2 == 4) {
                return new dtdo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dtdp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtdp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
