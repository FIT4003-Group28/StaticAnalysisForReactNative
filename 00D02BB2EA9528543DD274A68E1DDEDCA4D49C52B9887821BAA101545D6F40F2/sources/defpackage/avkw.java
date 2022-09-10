package defpackage;
/* compiled from: PG */
/* renamed from: avkw  reason: default package */
/* loaded from: classes3.dex */
public final class avkw extends dsqw<avkw, avkv> implements dssk {
    public static final avkw d;
    private static volatile dssr<avkw> f;
    public int a;
    public avla b;
    public dlql c;
    private byte e = 2;

    static {
        avkw avkwVar = new avkw();
        d = avkwVar;
        dsqw.cc(avkw.class, avkwVar);
    }

    private avkw() {
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
                return new avkw();
            }
            if (i2 == 4) {
                return new avkv();
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
            dssr<avkw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (avkw.class) {
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
