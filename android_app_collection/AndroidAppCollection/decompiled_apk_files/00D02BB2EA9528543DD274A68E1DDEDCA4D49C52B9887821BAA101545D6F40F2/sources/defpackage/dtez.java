package defpackage;
/* compiled from: PG */
/* renamed from: dtez  reason: default package */
/* loaded from: classes6.dex */
public final class dtez extends dsqw<dtez, dtey> implements dssk {
    public static final dtez a;
    private static volatile dssr<dtez> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtez dtezVar = new dtez();
        a = dtezVar;
        dsqw.cc(dtez.class, dtezVar);
    }

    private dtez() {
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
                return new dtez();
            }
            if (i2 == 4) {
                return new dtey();
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
            dssr<dtez> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtez.class) {
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
