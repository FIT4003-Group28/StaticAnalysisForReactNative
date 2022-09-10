package defpackage;
/* compiled from: PG */
/* renamed from: dwxd  reason: default package */
/* loaded from: classes6.dex */
public final class dwxd extends dsqw<dwxd, dwxc> implements dssk {
    public static final dwxd d;
    private static volatile dssr<dwxd> f;
    public int a;
    public ddhk b;
    public dwwz c;
    private byte e = 2;

    static {
        dwxd dwxdVar = new dwxd();
        d = dwxdVar;
        dsqw.cc(dwxd.class, dwxdVar);
    }

    private dwxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwxd();
            }
            if (i2 == 4) {
                return new dwxc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dwxd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
