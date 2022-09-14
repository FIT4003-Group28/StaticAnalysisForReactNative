package defpackage;
/* compiled from: PG */
/* renamed from: drhs  reason: default package */
/* loaded from: classes6.dex */
public final class drhs extends dsqw<drhs, drhr> implements dssk {
    public static final drhs b;
    private static volatile dssr<drhs> c;
    public dsrj<drhq> a = dssu.b;

    static {
        drhs drhsVar = new drhs();
        b = drhsVar;
        dsqw.cc(drhs.class, drhsVar);
    }

    private drhs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drhq.class});
            }
            if (i2 == 3) {
                return new drhs();
            }
            if (i2 == 4) {
                return new drhr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drhs.class) {
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
