package defpackage;
/* compiled from: PG */
/* renamed from: dtxc  reason: default package */
/* loaded from: classes6.dex */
public final class dtxc extends dsqw<dtxc, dtwz> implements dssk {
    public static final dtxc a;
    private static volatile dssr<dtxc> f;
    private int b;
    private dgrh c;
    private dtxb d;
    private byte e = 2;

    static {
        dtxc dtxcVar = new dtxc();
        a = dtxcVar;
        dsqw.cc(dtxc.class, dtxcVar);
    }

    private dtxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0007\u0007ᐉ\b", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtxc();
            }
            if (i2 == 4) {
                return new dtwz();
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
            dssr<dtxc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtxc.class) {
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
