package defpackage;
/* compiled from: PG */
/* renamed from: dvga  reason: default package */
/* loaded from: classes6.dex */
public final class dvga extends dsqw<dvga, dvfz> implements dssk {
    public static final dvga b;
    private static volatile dssr<dvga> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<ddhk> a = dssu.b;

    static {
        dvga dvgaVar = new dvga();
        b = dvgaVar;
        dsqw.cc(dvga.class, dvgaVar);
    }

    private dvga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"c", "a", ddhk.class, "d"});
            }
            if (i2 == 3) {
                return new dvga();
            }
            if (i2 == 4) {
                return new dvfz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<dvga> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvga.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
