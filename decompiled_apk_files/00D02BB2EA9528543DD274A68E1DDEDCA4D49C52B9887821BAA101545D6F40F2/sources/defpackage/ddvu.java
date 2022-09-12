package defpackage;
/* compiled from: PG */
/* renamed from: ddvu  reason: default package */
/* loaded from: classes6.dex */
public final class ddvu extends dsqw<ddvu, ddvt> implements dssk {
    public static final ddvu c;
    private static volatile dssr<ddvu> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        ddvu ddvuVar = new ddvu();
        c = ddvuVar;
        dsqw.cc(ddvu.class, ddvuVar);
    }

    private ddvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000", new Object[]{"b", "a", ddvw.class, ddvs.class, ddwa.class, ddvy.class});
            }
            if (i2 == 3) {
                return new ddvu();
            }
            if (i2 == 4) {
                return new ddvt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<ddvu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddvu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
