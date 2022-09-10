package defpackage;
/* compiled from: PG */
/* renamed from: dpar  reason: default package */
/* loaded from: classes6.dex */
public final class dpar extends dsqw<dpar, dpaq> implements dssk {
    public static final dpar c;
    private static volatile dssr<dpar> f;
    public double a;
    public douj b;
    private int d;
    private byte e = 2;

    static {
        dpar dparVar = new dpar();
        c = dparVar;
        dsqw.cc(dpar.class, dparVar);
    }

    private dpar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001က\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpar();
            }
            if (i2 == 4) {
                return new dpaq();
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
            dssr<dpar> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpar.class) {
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
