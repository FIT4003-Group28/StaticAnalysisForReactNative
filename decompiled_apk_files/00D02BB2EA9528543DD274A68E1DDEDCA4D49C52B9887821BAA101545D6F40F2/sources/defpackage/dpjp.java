package defpackage;
/* compiled from: PG */
/* renamed from: dpjp  reason: default package */
/* loaded from: classes6.dex */
public final class dpjp extends dsqw<dpjp, dpjo> implements dssk {
    public static final dpjp c;
    private static volatile dssr<dpjp> e;
    public int a;
    public dpal b;
    private byte d = 2;

    static {
        dpjp dpjpVar = new dpjp();
        c = dpjpVar;
        dsqw.cc(dpjp.class, dpjpVar);
    }

    private dpjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpjp();
            }
            if (i2 == 4) {
                return new dpjo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dpjp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpjp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
