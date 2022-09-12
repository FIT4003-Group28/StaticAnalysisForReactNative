package defpackage;
/* compiled from: PG */
/* renamed from: duvz  reason: default package */
/* loaded from: classes6.dex */
public final class duvz extends dsqw<duvz, duvy> implements dssk {
    public static final duvz c;
    private static volatile dssr<duvz> f;
    public int a;
    public boolean b;
    private dnqh d;
    private byte e = 2;

    static {
        duvz duvzVar = new duvz();
        c = duvzVar;
        dsqw.cc(duvz.class, duvzVar);
    }

    private duvz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new duvz();
            }
            if (i2 == 4) {
                return new duvy();
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
            dssr<duvz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duvz.class) {
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
