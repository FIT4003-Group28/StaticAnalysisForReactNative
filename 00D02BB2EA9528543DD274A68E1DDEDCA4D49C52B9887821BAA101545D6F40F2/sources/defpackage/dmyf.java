package defpackage;
/* compiled from: PG */
/* renamed from: dmyf  reason: default package */
/* loaded from: classes6.dex */
public final class dmyf extends dsqw<dmyf, dmye> implements dssk {
    public static final dmyf a;
    private static volatile dssr<dmyf> f;
    private int b;
    private dmyb c;
    private dmyb d;
    private byte e = 2;

    static {
        dmyf dmyfVar = new dmyf();
        a = dmyfVar;
        dsqw.cc(dmyf.class, dmyfVar);
    }

    private dmyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmyf();
            }
            if (i2 == 4) {
                return new dmye();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmyf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmyf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
