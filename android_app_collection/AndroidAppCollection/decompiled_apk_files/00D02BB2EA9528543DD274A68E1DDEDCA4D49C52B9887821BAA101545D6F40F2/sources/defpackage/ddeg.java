package defpackage;
/* compiled from: PG */
/* renamed from: ddeg  reason: default package */
/* loaded from: classes5.dex */
public final class ddeg extends dsqw<ddeg, ddef> implements dssk {
    public static final ddeg b;
    private static volatile dssr<ddeg> d;
    private byte c = 2;
    public dsrj<ddee> a = dssu.b;

    static {
        ddeg ddegVar = new ddeg();
        b = ddegVar;
        dsqw.cc(ddeg.class, ddegVar);
    }

    private ddeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", ddee.class});
            }
            if (i2 == 3) {
                return new ddeg();
            }
            if (i2 == 4) {
                return new ddef();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<ddeg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddeg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
