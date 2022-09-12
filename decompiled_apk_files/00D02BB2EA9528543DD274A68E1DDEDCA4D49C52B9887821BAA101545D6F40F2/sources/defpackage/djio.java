package defpackage;
/* compiled from: PG */
/* renamed from: djio  reason: default package */
/* loaded from: classes6.dex */
public final class djio extends dsqw<djio, djin> implements dssk {
    public static final djio e;
    private static volatile dssr<djio> g;
    public int a;
    public dnqh b;
    public dhjx c;
    public boolean d;
    private byte f = 2;

    static {
        djio djioVar = new djio();
        e = djioVar;
        dsqw.cc(djio.class, djioVar);
    }

    private djio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဇ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djio();
            }
            if (i2 == 4) {
                return new djin();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djio> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djio.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
