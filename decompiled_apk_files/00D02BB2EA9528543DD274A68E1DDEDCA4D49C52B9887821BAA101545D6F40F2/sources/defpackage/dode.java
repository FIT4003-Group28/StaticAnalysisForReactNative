package defpackage;
/* compiled from: PG */
/* renamed from: dode  reason: default package */
/* loaded from: classes6.dex */
public final class dode extends dsqw<dode, dodd> implements dssk {
    public static final dode c;
    private static volatile dssr<dode> f;
    public doud a;
    private int d;
    private byte e = 2;
    public dsrj<dpgw> b = dssu.b;

    static {
        dode dodeVar = new dode();
        c = dodeVar;
        dsqw.cc(dode.class, dodeVar);
    }

    private dode() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"d", "a", "b", dpgw.class});
            }
            if (i2 == 3) {
                return new dode();
            }
            if (i2 == 4) {
                return new dodd();
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
            dssr<dode> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dode.class) {
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
