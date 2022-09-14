package defpackage;
/* compiled from: PG */
/* renamed from: drfx  reason: default package */
/* loaded from: classes6.dex */
public final class drfx extends dsqw<drfx, drfw> implements dssk {
    public static final drfx a;
    private static volatile dssr<drfx> b;

    static {
        drfx drfxVar = new drfx();
        a = drfxVar;
        dsqw.cc(drfx.class, drfxVar);
    }

    private drfx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drfx();
            }
            if (i2 == 4) {
                return new drfw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drfx.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
