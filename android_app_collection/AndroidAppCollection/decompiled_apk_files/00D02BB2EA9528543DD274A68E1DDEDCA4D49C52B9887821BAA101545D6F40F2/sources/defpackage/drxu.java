package defpackage;
/* compiled from: PG */
/* renamed from: drxu  reason: default package */
/* loaded from: classes6.dex */
public final class drxu extends dsqw<drxu, drxt> implements dssk {
    public static final drxu a;
    private static volatile dssr<drxu> b;

    static {
        drxu drxuVar = new drxu();
        a = drxuVar;
        dsqw.cc(drxu.class, drxuVar);
    }

    private drxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drxu();
            }
            if (i2 == 4) {
                return new drxt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drxu.class) {
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
