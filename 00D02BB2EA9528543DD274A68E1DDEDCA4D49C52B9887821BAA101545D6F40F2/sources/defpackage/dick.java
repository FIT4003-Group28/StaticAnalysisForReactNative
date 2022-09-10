package defpackage;
/* compiled from: PG */
/* renamed from: dick  reason: default package */
/* loaded from: classes6.dex */
public final class dick extends dsqw<dick, dicj> implements dssk {
    public static final dick a;
    private static volatile dssr<dick> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dick dickVar = new dick();
        a = dickVar;
        dsqw.cc(dick.class, dickVar);
    }

    private dick() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dick();
            }
            if (i2 == 4) {
                return new dicj();
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
            dssr<dick> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dick.class) {
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
