package defpackage;
/* compiled from: PG */
/* renamed from: dhrk  reason: default package */
/* loaded from: classes6.dex */
public final class dhrk extends dsqw<dhrk, dhrj> implements dssk {
    public static final dhrk a;
    private static volatile dssr<dhrk> b;

    static {
        dhrk dhrkVar = new dhrk();
        a = dhrkVar;
        dsqw.cc(dhrk.class, dhrkVar);
    }

    private dhrk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhrk();
            }
            if (i2 == 4) {
                return new dhrj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhrk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhrk.class) {
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
