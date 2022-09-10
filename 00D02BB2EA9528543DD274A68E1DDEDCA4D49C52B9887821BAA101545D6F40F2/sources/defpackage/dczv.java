package defpackage;
/* compiled from: PG */
/* renamed from: dczv  reason: default package */
/* loaded from: classes5.dex */
public final class dczv extends dsqw<dczv, dczu> implements dssk {
    public static final dczv a;
    private static volatile dssr<dczv> b;

    static {
        dczv dczvVar = new dczv();
        a = dczvVar;
        dsqw.cc(dczv.class, dczvVar);
    }

    private dczv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dczv();
            }
            if (i2 == 4) {
                return new dczu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dczv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dczv.class) {
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
