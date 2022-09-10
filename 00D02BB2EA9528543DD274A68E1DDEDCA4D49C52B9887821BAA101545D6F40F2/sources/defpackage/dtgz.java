package defpackage;
/* compiled from: PG */
/* renamed from: dtgz  reason: default package */
/* loaded from: classes6.dex */
public final class dtgz extends dsqw<dtgz, dtgy> implements dssk {
    public static final dtgz a;
    private static volatile dssr<dtgz> b;

    static {
        dtgz dtgzVar = new dtgz();
        a = dtgzVar;
        dsqw.cc(dtgz.class, dtgzVar);
    }

    private dtgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtgz();
            }
            if (i2 == 4) {
                return new dtgy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtgz.class) {
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
