package defpackage;
/* compiled from: PG */
/* renamed from: cgcc  reason: default package */
/* loaded from: classes4.dex */
public final class cgcc extends dsqw<cgcc, cgcb> implements dssk {
    public static final cgcc a;
    private static volatile dssr<cgcc> b;

    static {
        cgcc cgccVar = new cgcc();
        a = cgccVar;
        dsqw.cc(cgcc.class, cgccVar);
    }

    private cgcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cgcc();
            }
            if (i2 == 4) {
                return new cgcb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgcc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cgcc.class) {
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
