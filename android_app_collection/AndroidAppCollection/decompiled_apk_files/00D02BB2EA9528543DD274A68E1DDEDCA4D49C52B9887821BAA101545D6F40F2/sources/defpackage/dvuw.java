package defpackage;
/* compiled from: PG */
/* renamed from: dvuw  reason: default package */
/* loaded from: classes6.dex */
public final class dvuw extends dsqw<dvuw, dvuv> implements dssk {
    public static final dvuw b;
    private static volatile dssr<dvuw> d;
    private byte c = 2;
    public dsrj<dvuu> a = dssu.b;

    static {
        dvuw dvuwVar = new dvuw();
        b = dvuwVar;
        dsqw.cc(dvuw.class, dvuwVar);
    }

    private dvuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dvuu.class});
            }
            if (i2 == 3) {
                return new dvuw();
            }
            if (i2 == 4) {
                return new dvuv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dvuw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvuw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
