package defpackage;
/* compiled from: PG */
/* renamed from: djax  reason: default package */
/* loaded from: classes6.dex */
public final class djax extends dsqw<djax, djaw> implements dssk {
    public static final djax a;
    private static volatile dssr<djax> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        djax djaxVar = new djax();
        a = djaxVar;
        dsqw.cc(djax.class, djaxVar);
    }

    private djax() {
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
                return new djax();
            }
            if (i2 == 4) {
                return new djaw();
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
            dssr<djax> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djax.class) {
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
