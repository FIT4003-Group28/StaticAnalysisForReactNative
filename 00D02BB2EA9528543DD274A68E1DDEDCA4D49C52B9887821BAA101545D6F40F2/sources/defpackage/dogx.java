package defpackage;
/* compiled from: PG */
/* renamed from: dogx  reason: default package */
/* loaded from: classes6.dex */
public final class dogx extends dsqw<dogx, dogw> implements dssk {
    public static final dogx a;
    private static volatile dssr<dogx> b;

    static {
        dogx dogxVar = new dogx();
        a = dogxVar;
        dsqw.cc(dogx.class, dogxVar);
    }

    private dogx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dogx();
            }
            if (i2 == 4) {
                return new dogw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dogx.class) {
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
