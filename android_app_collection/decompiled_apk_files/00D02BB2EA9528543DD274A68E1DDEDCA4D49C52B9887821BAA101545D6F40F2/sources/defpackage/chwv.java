package defpackage;
/* compiled from: PG */
/* renamed from: chwv  reason: default package */
/* loaded from: classes4.dex */
public final class chwv extends dsqw<chwv, chwu> implements dssk {
    public static final chwv a;
    private static volatile dssr<chwv> b;

    static {
        chwv chwvVar = new chwv();
        a = chwvVar;
        dsqw.cc(chwv.class, chwvVar);
    }

    private chwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new chwv();
            }
            if (i2 == 4) {
                return new chwu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (chwv.class) {
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
