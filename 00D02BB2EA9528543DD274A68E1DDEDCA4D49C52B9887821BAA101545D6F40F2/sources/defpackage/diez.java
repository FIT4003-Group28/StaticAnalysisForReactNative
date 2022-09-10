package defpackage;
/* compiled from: PG */
/* renamed from: diez  reason: default package */
/* loaded from: classes6.dex */
public final class diez extends dsqw<diez, diew> implements dssk {
    public static final diez c;
    private static volatile dssr<diez> f;
    public int a;
    public diey b;
    private dnqh d;
    private byte e = 2;

    static {
        diez diezVar = new diez();
        c = diezVar;
        dsqw.cc(diez.class, diezVar);
    }

    private diez() {
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
                return new diez();
            }
            if (i2 == 4) {
                return new diew();
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
            dssr<diez> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diez.class) {
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
