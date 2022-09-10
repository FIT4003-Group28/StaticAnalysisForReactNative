package defpackage;
/* compiled from: PG */
/* renamed from: dtqk  reason: default package */
/* loaded from: classes6.dex */
public final class dtqk extends dsqw<dtqk, dtqj> implements dssk {
    public static final dtqk a;
    private static volatile dssr<dtqk> e;
    private int b;
    private dtnz c;
    private byte d = 2;

    static {
        dtqk dtqkVar = new dtqk();
        a = dtqkVar;
        dsqw.cc(dtqk.class, dtqkVar);
    }

    private dtqk() {
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
                return new dtqk();
            }
            if (i2 == 4) {
                return new dtqj();
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
            dssr<dtqk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtqk.class) {
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
