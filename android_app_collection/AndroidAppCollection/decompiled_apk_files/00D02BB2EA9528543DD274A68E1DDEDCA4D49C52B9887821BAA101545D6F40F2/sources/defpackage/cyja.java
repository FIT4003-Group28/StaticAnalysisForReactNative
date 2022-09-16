package defpackage;
/* compiled from: PG */
/* renamed from: cyja  reason: default package */
/* loaded from: classes5.dex */
public final class cyja extends dsqw<cyja, cyiz> implements dssk {
    public static final cyja a;
    private static volatile dssr<cyja> b;

    static {
        cyja cyjaVar = new cyja();
        a = cyjaVar;
        dsqw.cc(cyja.class, cyjaVar);
    }

    private cyja() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new cyja();
            }
            if (i2 == 4) {
                return new cyiz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyja> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cyja.class) {
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
