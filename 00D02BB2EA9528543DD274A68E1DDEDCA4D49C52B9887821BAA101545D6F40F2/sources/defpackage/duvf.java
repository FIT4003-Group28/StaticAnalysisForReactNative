package defpackage;
/* compiled from: PG */
/* renamed from: duvf  reason: default package */
/* loaded from: classes6.dex */
public final class duvf extends dsqw<duvf, duve> implements dssk {
    public static final duvf a;
    private static volatile dssr<duvf> f;
    private int b;
    private dgrh c;
    private duma d;
    private byte e = 2;

    static {
        duvf duvfVar = new duvf();
        a = duvfVar;
        dsqw.cc(duvf.class, duvfVar);
    }

    private duvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\n\r\u0002\u0000\u0000\u0002\nᐉ\u0007\rᐉ\t", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new duvf();
            }
            if (i2 == 4) {
                return new duve();
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
            dssr<duvf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duvf.class) {
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
