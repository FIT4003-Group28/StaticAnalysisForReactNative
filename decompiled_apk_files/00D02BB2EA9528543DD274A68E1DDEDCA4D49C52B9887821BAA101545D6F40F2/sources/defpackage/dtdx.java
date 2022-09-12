package defpackage;
/* compiled from: PG */
/* renamed from: dtdx  reason: default package */
/* loaded from: classes6.dex */
public final class dtdx extends dsqw<dtdx, dtdw> implements dssk {
    public static final dtdx a;
    private static volatile dssr<dtdx> e;
    private int b;
    private dtdv c;
    private byte d = 2;

    static {
        dtdx dtdxVar = new dtdx();
        a = dtdxVar;
        dsqw.cc(dtdx.class, dtdxVar);
    }

    private dtdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtdx();
            }
            if (i2 == 4) {
                return new dtdw();
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
            dssr<dtdx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtdx.class) {
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
