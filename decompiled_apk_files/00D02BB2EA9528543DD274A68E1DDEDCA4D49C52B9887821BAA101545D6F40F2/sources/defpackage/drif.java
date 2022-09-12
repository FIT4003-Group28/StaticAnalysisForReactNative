package defpackage;
/* compiled from: PG */
/* renamed from: drif  reason: default package */
/* loaded from: classes6.dex */
public final class drif extends dsqw<drif, drie> implements dssk {
    public static final drif a;
    private static volatile dssr<drif> b;

    static {
        drif drifVar = new drif();
        a = drifVar;
        dsqw.cc(drif.class, drifVar);
    }

    private drif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drif();
            }
            if (i2 == 4) {
                return new drie();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drif> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drif.class) {
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
