package defpackage;
/* compiled from: PG */
/* renamed from: dhus  reason: default package */
/* loaded from: classes6.dex */
public final class dhus extends dsqw<dhus, dhur> implements dssk {
    public static final dhus a;
    private static volatile dssr<dhus> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhus dhusVar = new dhus();
        a = dhusVar;
        dsqw.cc(dhus.class, dhusVar);
    }

    private dhus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhus();
            }
            if (i2 == 4) {
                return new dhur();
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
            dssr<dhus> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhus.class) {
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
