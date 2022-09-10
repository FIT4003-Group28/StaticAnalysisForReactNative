package defpackage;
/* compiled from: PG */
/* renamed from: dvva  reason: default package */
/* loaded from: classes6.dex */
public final class dvva extends dsqw<dvva, dvuz> implements dssk {
    public static final dvva b;
    private static volatile dssr<dvva> d;
    private byte c = 2;
    public dsrj<dvuy> a = dssu.b;

    static {
        dvva dvvaVar = new dvva();
        b = dvvaVar;
        dsqw.cc(dvva.class, dvvaVar);
    }

    private dvva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dvuy.class});
            }
            if (i2 == 3) {
                return new dvva();
            }
            if (i2 == 4) {
                return new dvuz();
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
            dssr<dvva> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvva.class) {
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
