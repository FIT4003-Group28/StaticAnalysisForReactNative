package defpackage;
/* compiled from: PG */
/* renamed from: dibd  reason: default package */
/* loaded from: classes6.dex */
public final class dibd extends dsqw<dibd, diax> implements dssk {
    public static final dibd d;
    private static volatile dssr<dibd> f;
    public int a;
    public dibc b;
    private byte e = 2;
    public dsrj<diaz> c = dssu.b;

    static {
        dibd dibdVar = new dibd();
        d = dibdVar;
        dsqw.cc(dibd.class, dibdVar);
    }

    private dibd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", diaz.class});
            }
            if (i2 == 3) {
                return new dibd();
            }
            if (i2 == 4) {
                return new diax();
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
            dssr<dibd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dibd.class) {
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
