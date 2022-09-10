package defpackage;
/* compiled from: PG */
/* renamed from: dtod  reason: default package */
/* loaded from: classes6.dex */
public final class dtod extends dsqw<dtod, dtoa> implements dssk {
    public static final dtod a;
    private static volatile dssr<dtod> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dtod dtodVar = new dtod();
        a = dtodVar;
        dsqw.cc(dtod.class, dtodVar);
    }

    private dtod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtod();
            }
            if (i2 == 4) {
                return new dtoa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dtod> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtod.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
