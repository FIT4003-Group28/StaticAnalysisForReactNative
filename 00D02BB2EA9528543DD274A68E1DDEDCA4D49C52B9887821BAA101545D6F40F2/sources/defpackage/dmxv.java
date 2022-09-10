package defpackage;
/* compiled from: PG */
/* renamed from: dmxv  reason: default package */
/* loaded from: classes.dex */
public final class dmxv extends dsqw<dmxv, dmxu> implements dssk {
    public static final dmxv b;
    private static volatile dssr<dmxv> d;
    private byte c = 2;
    public dsrj<dmxt> a = dssu.b;

    static {
        dmxv dmxvVar = new dmxv();
        b = dmxvVar;
        dsqw.cc(dmxv.class, dmxvVar);
    }

    private dmxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmxt.class});
            }
            if (i2 == 3) {
                return new dmxv();
            }
            if (i2 == 4) {
                return new dmxu();
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
            dssr<dmxv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmxv.class) {
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
