package defpackage;
/* compiled from: PG */
/* renamed from: dhre  reason: default package */
/* loaded from: classes6.dex */
public final class dhre extends dsqw<dhre, dhrd> implements dssk {
    public static final dhre a;
    private static volatile dssr<dhre> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhre dhreVar = new dhre();
        a = dhreVar;
        dsqw.cc(dhre.class, dhreVar);
    }

    private dhre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhre();
            }
            if (i2 == 4) {
                return new dhrd();
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
            dssr<dhre> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhre.class) {
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
