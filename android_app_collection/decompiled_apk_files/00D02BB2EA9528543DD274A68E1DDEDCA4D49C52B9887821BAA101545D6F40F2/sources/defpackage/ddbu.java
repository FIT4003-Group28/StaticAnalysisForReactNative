package defpackage;
/* compiled from: PG */
/* renamed from: ddbu  reason: default package */
/* loaded from: classes5.dex */
public final class ddbu extends dsqw<ddbu, ddbt> implements dssk {
    public static final ddbu a;
    private static volatile dssr<ddbu> e;
    private int b;
    private dtbk c;
    private byte d = 2;

    static {
        ddbu ddbuVar = new ddbu();
        a = ddbuVar;
        dsqw.cc(ddbu.class, ddbuVar);
    }

    private ddbu() {
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
                return new ddbu();
            }
            if (i2 == 4) {
                return new ddbt();
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
            dssr<ddbu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddbu.class) {
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
