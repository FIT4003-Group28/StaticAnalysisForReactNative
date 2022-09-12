package defpackage;
/* compiled from: PG */
/* renamed from: dtdf  reason: default package */
/* loaded from: classes6.dex */
public final class dtdf extends dsqw<dtdf, dtde> implements dssk {
    public static final dtdf a;
    private static volatile dssr<dtdf> f;
    private int b;
    private dtdh c;
    private dtse d;
    private byte e = 2;

    static {
        dtdf dtdfVar = new dtdf();
        a = dtdfVar;
        dsqw.cc(dtdf.class, dtdfVar);
    }

    private dtdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\bᐉ\u0002", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtdf();
            }
            if (i2 == 4) {
                return new dtde();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dtdf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtdf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
