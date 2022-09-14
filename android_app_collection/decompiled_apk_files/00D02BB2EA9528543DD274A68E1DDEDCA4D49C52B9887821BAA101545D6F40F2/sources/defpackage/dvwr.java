package defpackage;
/* compiled from: PG */
/* renamed from: dvwr  reason: default package */
/* loaded from: classes.dex */
public final class dvwr extends dsqw<dvwr, dvwq> implements dssk {
    public static final dvwr b;
    private static volatile dssr<dvwr> d;
    private byte c = 2;
    public dsrj<dvwp> a = dssu.b;

    static {
        dvwr dvwrVar = new dvwr();
        b = dvwrVar;
        dsqw.cc(dvwr.class, dvwrVar);
    }

    private dvwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", dvwp.class});
            }
            if (i2 == 3) {
                return new dvwr();
            }
            if (i2 == 4) {
                return new dvwq();
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
            dssr<dvwr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvwr.class) {
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
