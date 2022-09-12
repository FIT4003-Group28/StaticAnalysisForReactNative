package defpackage;
/* compiled from: PG */
/* renamed from: djxs  reason: default package */
/* loaded from: classes6.dex */
public final class djxs extends dsqw<djxs, djxp> implements dssk {
    public static final djxs b;
    private static volatile dssr<djxs> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<djxr> a = dssu.b;

    static {
        djxs djxsVar = new djxs();
        b = djxsVar;
        dsqw.cc(djxs.class, djxsVar);
    }

    private djxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"c", "d", "a", djxr.class});
            }
            if (i2 == 3) {
                return new djxs();
            }
            if (i2 == 4) {
                return new djxp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<djxs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djxs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
