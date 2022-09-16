package defpackage;
/* compiled from: PG */
/* renamed from: dfxd  reason: default package */
/* loaded from: classes6.dex */
public final class dfxd extends dsqw<dfxd, dfxc> implements dssk {
    public static final dfxd c;
    private static volatile dssr<dfxd> f;
    public int a;
    public dszq b;
    private dfxk d;
    private byte e = 2;

    static {
        dfxd dfxdVar = new dfxd();
        c = dfxdVar;
        dsqw.cc(dfxd.class, dfxdVar);
    }

    private dfxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dfxd();
            }
            if (i2 == 4) {
                return new dfxc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dfxd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfxd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
