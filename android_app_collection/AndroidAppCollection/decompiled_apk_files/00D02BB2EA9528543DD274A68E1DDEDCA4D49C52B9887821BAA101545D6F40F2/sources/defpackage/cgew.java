package defpackage;
/* compiled from: PG */
/* renamed from: cgew  reason: default package */
/* loaded from: classes4.dex */
public final class cgew extends dsqw<cgew, cgev> implements dssk {
    public static final cgew b;
    private static volatile dssr<cgew> d;
    private byte c = 2;
    public dsrj<cgeu> a = dssu.b;

    static {
        cgew cgewVar = new cgew();
        b = cgewVar;
        dsqw.cc(cgew.class, cgewVar);
    }

    private cgew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", cgeu.class});
            }
            if (i2 == 3) {
                return new cgew();
            }
            if (i2 == 4) {
                return new cgev();
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
            dssr<cgew> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cgew.class) {
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
