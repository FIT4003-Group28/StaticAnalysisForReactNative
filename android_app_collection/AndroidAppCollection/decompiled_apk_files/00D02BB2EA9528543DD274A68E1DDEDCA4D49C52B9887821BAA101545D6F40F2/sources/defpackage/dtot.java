package defpackage;
/* compiled from: PG */
/* renamed from: dtot  reason: default package */
/* loaded from: classes6.dex */
public final class dtot extends dsqw<dtot, dtos> implements dssk {
    public static final dtot a;
    private static volatile dssr<dtot> e;
    private int b;
    private dtnz c;
    private byte d = 2;

    static {
        dtot dtotVar = new dtot();
        a = dtotVar;
        dsqw.cc(dtot.class, dtotVar);
    }

    private dtot() {
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
                return new dtot();
            }
            if (i2 == 4) {
                return new dtos();
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
            dssr<dtot> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtot.class) {
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
