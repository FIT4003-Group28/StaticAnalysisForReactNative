package defpackage;
/* compiled from: PG */
/* renamed from: dzym  reason: default package */
/* loaded from: classes6.dex */
public final class dzym extends dsqw<dzym, dzyl> implements dssk {
    public static final dzym a;
    private static volatile dssr<dzym> b;

    static {
        dzym dzymVar = new dzym();
        a = dzymVar;
        dsqw.cc(dzym.class, dzymVar);
    }

    private dzym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dzym();
            }
            if (i2 == 4) {
                return new dzyl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzym> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dzym.class) {
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
