package defpackage;
/* compiled from: PG */
/* renamed from: dtjl  reason: default package */
/* loaded from: classes6.dex */
public final class dtjl extends dsqw<dtjl, dtjk> implements dssk {
    public static final dtjl c;
    private static volatile dssr<dtjl> f;
    public dvvc a;
    public dvvi b;
    private int d;
    private byte e = 2;

    static {
        dtjl dtjlVar = new dtjl();
        c = dtjlVar;
        dsqw.cc(dtjl.class, dtjlVar);
    }

    private dtjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dtjl();
            }
            if (i2 == 4) {
                return new dtjk();
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
            dssr<dtjl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtjl.class) {
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
