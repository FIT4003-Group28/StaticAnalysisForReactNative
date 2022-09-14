package defpackage;
/* compiled from: PG */
/* renamed from: dnxq  reason: default package */
/* loaded from: classes6.dex */
public final class dnxq extends dsqw<dnxq, dnxp> implements dssk {
    public static final dnxq c;
    private static volatile dssr<dnxq> f;
    public dnng b;
    private int d;
    private byte e = 2;
    public String a = "";

    static {
        dnxq dnxqVar = new dnxq();
        c = dnxqVar;
        dsqw.cc(dnxq.class, dnxqVar);
    }

    private dnxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnxq();
            }
            if (i2 == 4) {
                return new dnxp();
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
            dssr<dnxq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnxq.class) {
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
