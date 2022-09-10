package defpackage;
/* compiled from: PG */
/* renamed from: ddex  reason: default package */
/* loaded from: classes5.dex */
public final class ddex extends dsqw<ddex, ddew> implements dssk {
    public static final ddex a;
    private static volatile dssr<ddex> e;
    private int b;
    private dder c;
    private byte d = 2;

    static {
        ddex ddexVar = new ddex();
        a = ddexVar;
        dsqw.cc(ddex.class, ddexVar);
    }

    private ddex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ddex();
            }
            if (i2 == 4) {
                return new ddew();
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
            dssr<ddex> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddex.class) {
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
