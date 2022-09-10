package defpackage;
/* compiled from: PG */
/* renamed from: dtej  reason: default package */
/* loaded from: classes6.dex */
public final class dtej extends dsqw<dtej, dtei> implements dssk {
    public static final dtej a;
    private static volatile dssr<dtej> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtej dtejVar = new dtej();
        a = dtejVar;
        dsqw.cc(dtej.class, dtejVar);
    }

    private dtej() {
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
                return new dtej();
            }
            if (i2 == 4) {
                return new dtei();
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
            dssr<dtej> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtej.class) {
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
