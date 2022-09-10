package defpackage;
/* compiled from: PG */
/* renamed from: dtox  reason: default package */
/* loaded from: classes6.dex */
public final class dtox extends dsqw<dtox, dtow> implements dssk {
    public static final dtox c;
    private static volatile dssr<dtox> e;
    public int a;
    public dgrh b;
    private byte d = 2;

    static {
        dtox dtoxVar = new dtox();
        c = dtoxVar;
        dsqw.cc(dtox.class, dtoxVar);
    }

    private dtox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtox();
            }
            if (i2 == 4) {
                return new dtow();
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
            dssr<dtox> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtox.class) {
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
