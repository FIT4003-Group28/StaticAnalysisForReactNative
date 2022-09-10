package defpackage;
/* compiled from: PG */
/* renamed from: djya  reason: default package */
/* loaded from: classes6.dex */
public final class djya extends dsqw<djya, djxz> implements dssk {
    public static final djya d;
    private static volatile dssr<djya> f;
    public int a;
    public drih b;
    public dnqh c;
    private byte e = 2;

    static {
        djya djyaVar = new djya();
        d = djyaVar;
        dsqw.cc(djya.class, djyaVar);
    }

    private djya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djya();
            }
            if (i2 == 4) {
                return new djxz();
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
            dssr<djya> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djya.class) {
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
