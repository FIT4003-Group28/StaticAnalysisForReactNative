package defpackage;
/* compiled from: PG */
/* renamed from: digz  reason: default package */
/* loaded from: classes6.dex */
public final class digz extends dsqw<digz, digw> implements dssk {
    public static final digz d;
    private static volatile dssr<digz> f;
    public int a;
    public dnqh c;
    private byte e = 2;
    public dsrj<digy> b = dssu.b;

    static {
        digz digzVar = new digz();
        d = digzVar;
        dsqw.cc(digz.class, digzVar);
    }

    private digz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", digy.class, "c"});
            }
            if (i2 == 3) {
                return new digz();
            }
            if (i2 == 4) {
                return new digw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<digz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (digz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
