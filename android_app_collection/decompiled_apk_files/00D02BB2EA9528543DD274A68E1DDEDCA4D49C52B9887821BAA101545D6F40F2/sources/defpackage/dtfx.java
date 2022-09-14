package defpackage;
/* compiled from: PG */
/* renamed from: dtfx  reason: default package */
/* loaded from: classes6.dex */
public final class dtfx extends dsqw<dtfx, dtfw> implements dssk {
    public static final dtfx a;
    private static volatile dssr<dtfx> d;
    private dtdv b;
    private byte c = 2;

    static {
        dtfx dtfxVar = new dtfx();
        a = dtfxVar;
        dsqw.cc(dtfx.class, dtfxVar);
    }

    private dtfx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 0;
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"b"});
            }
            if (i2 == 3) {
                return new dtfx();
            }
            if (i2 == 4) {
                return new dtfw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj != null) {
                    b = 1;
                }
                this.c = b;
                return null;
            }
            dssr<dtfx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtfx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
