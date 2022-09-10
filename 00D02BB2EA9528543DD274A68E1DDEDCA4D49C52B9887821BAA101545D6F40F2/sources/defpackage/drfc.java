package defpackage;
/* compiled from: PG */
/* renamed from: drfc  reason: default package */
/* loaded from: classes6.dex */
public final class drfc extends dsqw<drfc, drfb> implements dssk {
    public static final drfc c;
    private static volatile dssr<drfc> d;
    public int a;
    public int b;

    static {
        drfc drfcVar = new drfc();
        c = drfcVar;
        dsqw.cc(drfc.class, drfcVar);
    }

    private drfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drey.c()});
            }
            if (i2 == 3) {
                return new drfc();
            }
            if (i2 == 4) {
                return new drfb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drfc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
