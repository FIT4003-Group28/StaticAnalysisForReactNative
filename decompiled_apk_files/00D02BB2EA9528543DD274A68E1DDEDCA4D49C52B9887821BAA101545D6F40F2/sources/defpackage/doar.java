package defpackage;
/* compiled from: PG */
/* renamed from: doar  reason: default package */
/* loaded from: classes6.dex */
public final class doar extends dsqw<doar, doaq> implements dssk {
    public static final doar c;
    private static volatile dssr<doar> f;
    public int a;
    public dniz b;
    private dnhq d;
    private byte e = 2;

    static {
        doar doarVar = new doar();
        c = doarVar;
        dsqw.cc(doar.class, doarVar);
    }

    private doar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new doar();
            }
            if (i2 == 4) {
                return new doaq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<doar> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doar.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
