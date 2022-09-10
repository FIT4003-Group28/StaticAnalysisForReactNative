package defpackage;
/* compiled from: PG */
/* renamed from: dimi  reason: default package */
/* loaded from: classes6.dex */
public final class dimi extends dsqw<dimi, dimh> implements dssk {
    public static final dimi a;
    private static volatile dssr<dimi> b;

    static {
        dimi dimiVar = new dimi();
        a = dimiVar;
        dsqw.cc(dimi.class, dimiVar);
    }

    private dimi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dimi();
            }
            if (i2 == 4) {
                return new dimh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dimi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dimi.class) {
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
