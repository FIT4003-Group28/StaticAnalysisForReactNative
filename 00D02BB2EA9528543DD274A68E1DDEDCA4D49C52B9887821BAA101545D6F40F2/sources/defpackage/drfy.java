package defpackage;
/* compiled from: PG */
/* renamed from: drfy  reason: default package */
/* loaded from: classes6.dex */
public final class drfy extends dsqw<drfy, drfv> implements dssk {
    public static final drfy b;
    private static volatile dssr<drfy> c;
    public dsrj<drfx> a = dssu.b;

    static {
        drfy drfyVar = new drfy();
        b = drfyVar;
        dsqw.cc(drfy.class, drfyVar);
    }

    private drfy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drfx.class});
            }
            if (i2 == 3) {
                return new drfy();
            }
            if (i2 == 4) {
                return new drfv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drfy.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
