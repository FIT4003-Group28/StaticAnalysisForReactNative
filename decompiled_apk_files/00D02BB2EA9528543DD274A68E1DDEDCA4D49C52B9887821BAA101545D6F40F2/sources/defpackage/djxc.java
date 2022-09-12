package defpackage;
/* compiled from: PG */
/* renamed from: djxc  reason: default package */
/* loaded from: classes6.dex */
public final class djxc extends dsqw<djxc, djxb> implements dssk {
    public static final djxc c;
    private static volatile dssr<djxc> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public dspd b = dspd.b;

    static {
        djxc djxcVar = new djxc();
        c = djxcVar;
        dsqw.cc(djxc.class, djxcVar);
    }

    private djxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new djxc();
            }
            if (i2 == 4) {
                return new djxb();
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
            dssr<djxc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djxc.class) {
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
