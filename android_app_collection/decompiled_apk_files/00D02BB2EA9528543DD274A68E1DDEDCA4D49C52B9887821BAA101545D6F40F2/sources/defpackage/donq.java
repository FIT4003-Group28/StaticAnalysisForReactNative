package defpackage;
/* compiled from: PG */
/* renamed from: donq  reason: default package */
/* loaded from: classes6.dex */
public final class donq extends dsqw<donq, donp> implements dssk {
    public static final donq a;
    private static volatile dssr<donq> b;

    static {
        donq donqVar = new donq();
        a = donqVar;
        dsqw.cc(donq.class, donqVar);
    }

    private donq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new donq();
            }
            if (i2 == 4) {
                return new donp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<donq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (donq.class) {
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
