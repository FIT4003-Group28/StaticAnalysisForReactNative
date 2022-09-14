package defpackage;
/* compiled from: PG */
/* renamed from: dtdt  reason: default package */
/* loaded from: classes6.dex */
public final class dtdt extends dsqw<dtdt, dtds> implements dssk {
    public static final dtdt a;
    private static volatile dssr<dtdt> e;
    private int b;
    private dted c;
    private byte d = 2;

    static {
        dtdt dtdtVar = new dtdt();
        a = dtdtVar;
        dsqw.cc(dtdt.class, dtdtVar);
    }

    private dtdt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtdt();
            }
            if (i2 == 4) {
                return new dtds();
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
            dssr<dtdt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtdt.class) {
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
