package defpackage;
/* compiled from: PG */
/* renamed from: dtxd  reason: default package */
/* loaded from: classes6.dex */
public final class dtxd extends dsqw<dtxd, dtwy> implements dssk {
    public static final dtxd a;
    private static volatile dssr<dtxd> e;
    private int b;
    private dtxc c;
    private byte d = 2;

    static {
        dtxd dtxdVar = new dtxd();
        a = dtxdVar;
        dsqw.cc(dtxd.class, dtxdVar);
    }

    private dtxd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u000e", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtxd();
            }
            if (i2 == 4) {
                return new dtwy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dtxd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtxd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
