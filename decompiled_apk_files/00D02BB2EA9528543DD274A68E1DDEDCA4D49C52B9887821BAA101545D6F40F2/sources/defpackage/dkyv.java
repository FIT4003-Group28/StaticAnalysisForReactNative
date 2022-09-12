package defpackage;
/* compiled from: PG */
/* renamed from: dkyv  reason: default package */
/* loaded from: classes6.dex */
public final class dkyv extends dsqw<dkyv, dkyu> implements dssk {
    public static final dkyv a;
    private static volatile dssr<dkyv> b;

    static {
        dkyv dkyvVar = new dkyv();
        a = dkyvVar;
        dsqw.cc(dkyv.class, dkyvVar);
    }

    private dkyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkyv();
            }
            if (i2 == 4) {
                return new dkyu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkyv.class) {
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
