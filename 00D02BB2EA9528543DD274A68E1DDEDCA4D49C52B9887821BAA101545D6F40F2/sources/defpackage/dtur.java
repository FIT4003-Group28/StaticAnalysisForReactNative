package defpackage;
/* compiled from: PG */
/* renamed from: dtur  reason: default package */
/* loaded from: classes6.dex */
public final class dtur extends dsqw<dtur, dtuq> implements dssk {
    public static final dtur a;
    private static volatile dssr<dtur> b;

    static {
        dtur dturVar = new dtur();
        a = dturVar;
        dsqw.cc(dtur.class, dturVar);
    }

    private dtur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtur();
            }
            if (i2 == 4) {
                return new dtuq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtur> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtur.class) {
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
