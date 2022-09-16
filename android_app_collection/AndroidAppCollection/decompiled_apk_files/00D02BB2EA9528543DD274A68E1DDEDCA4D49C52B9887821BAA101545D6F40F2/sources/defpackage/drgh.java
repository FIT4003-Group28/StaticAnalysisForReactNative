package defpackage;
/* compiled from: PG */
/* renamed from: drgh  reason: default package */
/* loaded from: classes6.dex */
public final class drgh extends dsqw<drgh, drgg> implements dssk {
    public static final drgh b;
    private static volatile dssr<drgh> c;
    public dsrj<drgf> a = dssu.b;

    static {
        drgh drghVar = new drgh();
        b = drghVar;
        dsqw.cc(drgh.class, drghVar);
    }

    private drgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drgf.class});
            }
            if (i2 == 3) {
                return new drgh();
            }
            if (i2 == 4) {
                return new drgg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drgh.class) {
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
