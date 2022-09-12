package defpackage;
/* compiled from: PG */
/* renamed from: dwuv  reason: default package */
/* loaded from: classes6.dex */
public final class dwuv extends dsqw<dwuv, dwus> implements dssk {
    public static final dwuv c;
    private static volatile dssr<dwuv> f;
    public int a;
    public dwuu b;
    private dnqh d;
    private byte e = 2;

    static {
        dwuv dwuvVar = new dwuv();
        c = dwuvVar;
        dsqw.cc(dwuv.class, dwuvVar);
    }

    private dwuv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0001\u0005ဉ\u0002\u0006ᐉ\u0004", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dwuv();
            }
            if (i2 == 4) {
                return new dwus();
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
            dssr<dwuv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwuv.class) {
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
