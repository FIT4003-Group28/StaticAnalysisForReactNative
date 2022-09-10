package defpackage;
/* compiled from: PG */
/* renamed from: ddwa  reason: default package */
/* loaded from: classes6.dex */
public final class ddwa extends dsqw<ddwa, ddvz> implements dssk {
    public static final ddwa a;
    private static volatile dssr<ddwa> c;
    private byte b = 2;

    static {
        ddwa ddwaVar = new ddwa();
        a = ddwaVar;
        dsqw.cc(ddwa.class, ddwaVar);
    }

    private ddwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddwa();
            }
            if (i2 == 4) {
                return new ddvz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<ddwa> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddwa.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
